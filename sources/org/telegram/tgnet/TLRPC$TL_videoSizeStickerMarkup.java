package org.telegram.tgnet;
public class TLRPC$TL_videoSizeStickerMarkup extends TLRPC$VideoSize {
    public long sticker_id;
    public TLRPC$InputStickerSet stickerset;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.stickerset = TLRPC$InputStickerSet.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.sticker_id = abstractSerializedData.readInt64(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.background_colors.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(228623102);
        this.stickerset.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.sticker_id);
        abstractSerializedData.writeInt32(481674261);
        int size = this.background_colors.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.background_colors.get(i).intValue());
        }
    }
}
