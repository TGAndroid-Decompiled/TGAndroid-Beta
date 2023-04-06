package org.telegram.tgnet;
public class TLRPC$TL_stickerSetNoCovered extends TLRPC$StickerSetCovered {
    public static int constructor = 2008112412;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.set = TLRPC$StickerSet.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.set.serializeToStream(abstractSerializedData);
    }
}
