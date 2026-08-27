package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.iy0;

public class TLJsonParser {
    private final JSONObject jsonObject;

    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        try {
            return callbackReturn.run(tLJsonParser);
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    private boolean parseBoolean(Object obj, boolean z10) {
        try {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
        } catch (Exception e9) {
            FileLog.e(e9);
            return z10;
        }
    }

    private int parseInt32(Object obj, int i10) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            return obj instanceof String ? Integer.parseInt((String) obj, 10) : i10;
        } catch (Exception e9) {
            FileLog.e(e9);
            return i10;
        }
    }

    private long parseInt64(Object obj, long j10) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            return obj instanceof String ? Long.parseLong((String) obj, 10) : j10;
        } catch (Exception e9) {
            FileLog.e(e9);
            return j10;
        }
    }

    private String parseString(Object obj, String str) {
        return obj instanceof String ? (String) obj : str;
    }

    public boolean readBoolean(String str, boolean z10) {
        return parseBoolean(this.jsonObject.opt(str), z10);
    }

    public int readInt32(String str, int i10) {
        return parseInt32(this.jsonObject.opt(str), i10);
    }

    public long readInt64(String str, int i10) {
        return parseInt64(this.jsonObject.opt(str), i10);
    }

    public <T extends Deserializable> T readObject(String str, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        JSONObject jSONObjectOptJSONObject = this.jsonObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return (T) parse(new TLJsonParser(jSONObjectOptJSONObject), callbackReturn);
        }
        return null;
    }

    public String readString(String str) {
        return readString(str, null);
    }

    public <T extends Deserializable> ArrayList<T> readVector(String str, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        iy0 iy0Var = (ArrayList<T>) new ArrayList();
        JSONArray jSONArrayOptJSONArray = this.jsonObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Deserializable deserializable = parse(new TLJsonParser(jSONArrayOptJSONArray.getJSONObject(i10)), callbackReturn);
                    if (deserializable != null) {
                        iy0Var.add(deserializable);
                    }
                } catch (JSONException e9) {
                    FileLog.e(e9);
                }
            }
        }
        return iy0Var;
    }

    public String readString(String str, String str2) {
        return parseString(this.jsonObject.opt(str), str2);
    }
}
