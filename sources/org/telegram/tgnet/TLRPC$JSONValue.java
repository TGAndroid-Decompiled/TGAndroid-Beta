package org.telegram.tgnet;

public abstract class TLRPC$JSONValue extends TLObject {
    public static TLRPC$JSONValue TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$JSONValue tLRPC$TL_jsonObject;
        switch (i) {
            case -1715350371:
                tLRPC$TL_jsonObject = new TLRPC$TL_jsonObject();
                break;
            case -1222740358:
                tLRPC$TL_jsonObject = new TLRPC$TL_jsonString();
                break;
            case -952869270:
                tLRPC$TL_jsonObject = new TLRPC$TL_jsonBool();
                break;
            case -146520221:
                tLRPC$TL_jsonObject = new TLRPC$TL_jsonArray();
                break;
            case 736157604:
                tLRPC$TL_jsonObject = new TLRPC$TL_jsonNumber();
                break;
            case 1064139624:
                tLRPC$TL_jsonObject = new TLRPC$TL_jsonNull();
                break;
            default:
                tLRPC$TL_jsonObject = null;
                break;
        }
        if (tLRPC$TL_jsonObject == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in JSONValue", Integer.valueOf(i)));
        }
        if (tLRPC$TL_jsonObject != null) {
            tLRPC$TL_jsonObject.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_jsonObject;
    }
}
