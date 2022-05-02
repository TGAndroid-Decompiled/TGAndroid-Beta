package org.telegram.tgnet;

public class TLRPC$TL_inputStickerSetID extends TLRPC$InputStickerSet {
    public static int constructor = -1645763991;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f865id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f865id);
        abstractSerializedData.writeInt64(this.access_hash);
    }
}
