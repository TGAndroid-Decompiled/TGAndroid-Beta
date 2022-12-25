package org.telegram.tgnet;

public class TLRPC$TL_inputPhoto extends TLRPC$InputPhoto {
    public static int constructor = 1001634122;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f870id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.file_reference = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f870id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeByteArray(this.file_reference);
    }
}
