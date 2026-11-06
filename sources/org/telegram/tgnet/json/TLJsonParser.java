package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.d20;
public class TLJsonParser {
    private final JSONObject jsonObject;

    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, d20 d20Var) {
        try {
            return (T) d20Var.a(tLJsonParser);
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    private boolean parseBoolean(Object obj, boolean z9) {
        try {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            return z9;
        } catch (Exception e10) {
            a8.g(e10, true);
            return z9;
        }
    }

    private int parseInt32(Object obj, int i7) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj, 10);
            }
            return i7;
        } catch (Exception e10) {
            a8.g(e10, true);
            return i7;
        }
    }

    private long parseInt64(Object obj, long j3) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Long.parseLong((String) obj, 10);
            }
            return j3;
        } catch (Exception e10) {
            a8.g(e10, true);
            return j3;
        }
    }

    private String parseString(Object obj, String str) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return str;
    }

    public boolean readBoolean(String str, boolean z9) {
        return parseBoolean(this.jsonObject.opt(str), z9);
    }

    public int readInt32(String str, int i7) {
        return parseInt32(this.jsonObject.opt(str), i7);
    }

    public long readInt64(String str, int i7) {
        return parseInt64(this.jsonObject.opt(str), i7);
    }

    public <T extends Deserializable> T readObject(String str, d20 d20Var) {
        JSONObject optJSONObject = this.jsonObject.optJSONObject(str);
        if (optJSONObject != null) {
            return (T) parse(new TLJsonParser(optJSONObject), d20Var);
        }
        return null;
    }

    public String readString(String str) {
        return readString(str, null);
    }

    public <T extends Deserializable> ArrayList<T> readVector(String str, d20 d20Var) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Deserializable parse = parse(new TLJsonParser(optJSONArray.getJSONObject(i7)), d20Var);
                    if (parse != null) {
                        arrayList.add(parse);
                    }
                } catch (JSONException e10) {
                    a8.g(e10, true);
                }
            }
        }
        return arrayList;
    }

    public String readString(String str, String str2) {
        return parseString(this.jsonObject.opt(str), str2);
    }
}
