package org.telegram.tgnet;

public class TLRPC$TL_dataJSON extends TLObject {
    public static int constructor = 2104790276;
    public String data;

    public static TLRPC$TL_dataJSON TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_dataJSON", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
        tLRPC$TL_dataJSON.readParams(abstractSerializedData, z);
        return tLRPC$TL_dataJSON;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.data = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.data);
    }
}
