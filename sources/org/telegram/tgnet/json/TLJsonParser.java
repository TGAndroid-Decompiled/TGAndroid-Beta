package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.v10;
public class TLJsonParser {
    private final JSONObject jsonObject;

    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, v10 v10Var) {
        try {
            return (T) v10Var.a(tLJsonParser);
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    private boolean parseBoolean(Object obj, boolean z10) {
        try {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            return z10;
        } catch (Exception e10) {
            a8.g(e10, true);
            return z10;
        }
    }

    private int parseInt32(Object obj, int i3) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj, 10);
            }
            return i3;
        } catch (Exception e10) {
            a8.g(e10, true);
            return i3;
        }
    }

    private long parseInt64(Object obj, long j10) {
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Long.parseLong((String) obj, 10);
            }
            return j10;
        } catch (Exception e10) {
            a8.g(e10, true);
            return j10;
        }
    }

    private String parseString(Object obj, String str) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return str;
    }

    public boolean readBoolean(String str, boolean z10) {
        return parseBoolean(this.jsonObject.opt(str), z10);
    }

    public int readInt32(String str, int i3) {
        return parseInt32(this.jsonObject.opt(str), i3);
    }

    public long readInt64(String str, int i3) {
        return parseInt64(this.jsonObject.opt(str), i3);
    }

    public <T extends Deserializable> T readObject(String str, v10 v10Var) {
        JSONObject optJSONObject = this.jsonObject.optJSONObject(str);
        if (optJSONObject != null) {
            return (T) parse(new TLJsonParser(optJSONObject), v10Var);
        }
        return null;
    }

    public String readString(String str) {
        return readString(str, null);
    }

    public <T extends Deserializable> ArrayList<T> readVector(String str, v10 v10Var) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Deserializable parse = parse(new TLJsonParser(optJSONArray.getJSONObject(i3)), v10Var);
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
