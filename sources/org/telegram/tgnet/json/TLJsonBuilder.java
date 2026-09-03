package org.telegram.tgnet.json;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public class TLJsonBuilder {
    private final JSONObject result2 = new JSONObject();

    public interface Serializable {
        void serializeToJson(TLJsonBuilder tLJsonBuilder);
    }

    private TLJsonBuilder() {
    }

    public static JSONObject serialize(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        try {
            TLJsonBuilder tLJsonBuilder = new TLJsonBuilder();
            serializable.serializeToJson(tLJsonBuilder);
            return tLJsonBuilder.result2;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    private void write(String str, Object obj) {
        try {
            this.result2.putOpt(str, obj);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public void writeBoolean(String str, boolean z4) {
        write(str, Boolean.valueOf(z4));
    }

    public void writeInt32(String str, int i10) {
        writeString(str, Integer.toString(i10, 10));
    }

    public void writeInt64(String str, long j10) {
        writeString(str, Long.toString(j10, 10));
    }

    public void writeObject(String str, Serializable serializable) {
        write(str, serialize(serializable));
    }

    public void writeString(String str, String str2) {
        write(str, str2);
    }

    public <T extends Serializable> void writeVector(String str, List<T> list) {
        JSONArray jSONArray = new JSONArray();
        for (T t6 : list) {
            JSONObject serialize = serialize(t6);
            if (serialize != null) {
                jSONArray.put(serialize);
            }
        }
        write(str, jSONArray);
    }
}
