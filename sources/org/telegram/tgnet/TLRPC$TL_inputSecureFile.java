package org.telegram.tgnet;
public class TLRPC$TL_inputSecureFile extends TLRPC$InputSecureFile {
    public static int constructor = 1399317950;
    public long access_hash;
    public long id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
    }
}
