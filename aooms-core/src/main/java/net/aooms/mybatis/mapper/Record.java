package net.aooms.mybatis.mapper;

import org.springframework.util.LinkedCaseInsensitiveMap;

/**
 * Record
 */
public class Record extends LinkedCaseInsensitiveMap {

    /**
     * 创建Record
     * @return
     */
    public static Record NEW(){
        return new Record();
    }

}
