package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class TLJsonParser {
    private final JSONObject jsonObject;

    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, rac racVar) {
        try {
            return (T) racVar.a(tLJsonParser);
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    private boolean parseBoolean(Object obj, boolean z) {
        try {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            return z;
        } catch (Exception e) {
            fc4.g(e, true);
            return z;
        }
    }

    private int parseInt32(Object obj, int i) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj, 10);
            }
            return i;
        } catch (Exception e) {
            fc4.g(e, true);
            return i;
        }
    }

    private long parseInt64(Object obj, long j) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Long.parseLong((String) obj, 10);
            }
            return j;
        } catch (Exception e) {
            fc4.g(e, true);
            return j;
        }
    }

    private String parseString(Object obj, String str) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return str;
    }

    public boolean readBoolean(String str, boolean z) {
        return parseBoolean(this.jsonObject.opt(str), z);
    }

    public int readInt32(String str, int i) {
        return parseInt32(this.jsonObject.opt(str), i);
    }

    public long readInt64(String str, int i) {
        return parseInt64(this.jsonObject.opt(str), i);
    }

    public <T extends Deserializable> T readObject(String str, rac racVar) {
        JSONObject optJSONObject = this.jsonObject.optJSONObject(str);
        if (optJSONObject != null) {
            return (T) parse(new TLJsonParser(optJSONObject), racVar);
        }
        return null;
    }

    public String readString(String str, String str2) {
        return parseString(this.jsonObject.opt(str), str2);
    }

    public <T extends Deserializable> ArrayList<T> readVector(String str, rac racVar) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    Deserializable parse = parse(new TLJsonParser(optJSONArray.getJSONObject(i)), racVar);
                    if (parse != null) {
                        arrayList.add(parse);
                    }
                } catch (JSONException e) {
                    fc4.g(e, true);
                }
            }
        }
        return arrayList;
    }

    public String readString(String str) {
        return readString(str, null);
    }
}
