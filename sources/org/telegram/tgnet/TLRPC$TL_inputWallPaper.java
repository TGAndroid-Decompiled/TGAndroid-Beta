package org.telegram.tgnet;

public class TLRPC$TL_inputWallPaper extends TLRPC$InputWallPaper {
    public static int constructor = -433014407;
    public long access_hash;
    public long f920id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f920id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f920id);
        abstractSerializedData.writeInt64(this.access_hash);
    }
}
