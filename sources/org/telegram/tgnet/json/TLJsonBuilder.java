package org.telegram.tgnet.json;

import java.util.Iterator;
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
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    private void write(String str, Object obj) {
        try {
            this.result2.putOpt(str, obj);
        } catch (JSONException e9) {
            FileLog.e(e9);
        }
    }

    public void writeBoolean(String str, boolean z10) {
        write(str, Boolean.valueOf(z10));
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
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectSerialize = serialize(it.next());
            if (jSONObjectSerialize != null) {
                jSONArray.put(jSONObjectSerialize);
            }
        }
        write(str, jSONArray);
    }
}
