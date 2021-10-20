package com.yorongrong.coroute;

import com.google.firebase.database.IgnoreExtraProperties;

// [START rtdb_user_class]
@IgnoreExtraProperties
public class Data {

    public String name;
    public String id;
    public String region;

    public Data() { }

    public Data(String id, String region) {
        this.id = id;
        this.region = region;
    }

}