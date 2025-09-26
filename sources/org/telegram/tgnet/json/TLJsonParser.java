package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.TableLayout;

public class TLJsonParser {
    private final JSONObject jsonObject;

    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    public <T extends Deserializable> T readObject(String str, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        JSONObject optJSONObject = this.jsonObject.optJSONObject(str);
        if (optJSONObject != null) {
            return (T) parse(new TLJsonParser(optJSONObject), callbackReturn);
        }
        return null;
    }

    public <T extends Deserializable> ArrayList<T> readVector(String str, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        TableLayout.Assoc assoc = (ArrayList<T>) new ArrayList();
        JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    Deserializable parse = parse(new TLJsonParser(optJSONArray.getJSONObject(i)), callbackReturn);
                    if (parse != null) {
                        assoc.add(parse);
                    }
                } catch (JSONException e) {
                    FileLog.e(e);
                }
            }
        }
        return assoc;
    }

    public int readInt32(String str, int i) {
        return parseInt32(this.jsonObject.opt(str), i);
    }

    public long readInt64(String str, int i) {
        return parseInt64(this.jsonObject.opt(str), i);
    }

    public String readString(String str) {
        return readString(str, null);
    }

    public String readString(String str, String str2) {
        return parseString(this.jsonObject.opt(str), str2);
    }

    public boolean readBoolean(String str, boolean z) {
        return parseBoolean(this.jsonObject.opt(str), z);
    }

    private String parseString(Object obj, String str) {
        return obj instanceof String ? (String) obj : str;
    }

    private boolean parseBoolean(Object obj, boolean z) {
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        return z;
    }

    private long parseInt64(Object obj, long j) {
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj, 10);
        }
        return j;
    }

    private int parseInt32(Object obj, int i) {
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj, 10);
        }
        return i;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        try {
            return callbackReturn.run(tLJsonParser);
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }
}
