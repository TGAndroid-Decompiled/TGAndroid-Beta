package org.telegram.tgnet;
public class TLRPC$TL_jsonObjectValue extends TLObject {
    public static int constructor = -1059185703;
    public String key;
    public TLRPC$JSONValue value;

    public static TLRPC$TL_jsonObjectValue TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_jsonObjectValue", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue = new TLRPC$TL_jsonObjectValue();
        tLRPC$TL_jsonObjectValue.readParams(abstractSerializedData, z);
        return tLRPC$TL_jsonObjectValue;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.key = abstractSerializedData.readString(z);
        this.value = TLRPC$JSONValue.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.key);
        this.value.serializeToStream(abstractSerializedData);
    }
}
