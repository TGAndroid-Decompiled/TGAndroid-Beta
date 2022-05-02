package org.telegram.tgnet;

public abstract class TLRPC$JSONValue extends TLObject {
    public static TLRPC$JSONValue TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$JSONValue tLRPC$JSONValue;
        switch (i) {
            case -1715350371:
                tLRPC$JSONValue = new TLRPC$TL_jsonObject();
                break;
            case -1222740358:
                tLRPC$JSONValue = new TLRPC$TL_jsonString();
                break;
            case -952869270:
                tLRPC$JSONValue = new TLRPC$TL_jsonBool();
                break;
            case -146520221:
                tLRPC$JSONValue = new TLRPC$TL_jsonArray();
                break;
            case 736157604:
                tLRPC$JSONValue = new TLRPC$TL_jsonNumber();
                break;
            case 1064139624:
                tLRPC$JSONValue = new TLRPC$TL_jsonNull();
                break;
            default:
                tLRPC$JSONValue = null;
                break;
        }
        if (tLRPC$JSONValue != null || !z) {
            if (tLRPC$JSONValue != null) {
                tLRPC$JSONValue.readParams(abstractSerializedData, z);
            }
            return tLRPC$JSONValue;
        }
        throw new RuntimeException(String.format("can't parse magic %x in JSONValue", Integer.valueOf(i)));
    }
}
