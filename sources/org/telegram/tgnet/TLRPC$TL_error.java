package org.telegram.tgnet;

public class TLRPC$TL_error extends TLObject {
    public int code;
    public String text;

    public static TLRPC$TL_error TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-994444869 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_error", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_error tLRPC$TL_error = new TLRPC$TL_error();
        tLRPC$TL_error.readParams(abstractSerializedData, z);
        return tLRPC$TL_error;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.code = abstractSerializedData.readInt32(z);
        this.text = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-994444869);
        abstractSerializedData.writeInt32(this.code);
        abstractSerializedData.writeString(this.text);
    }
}
