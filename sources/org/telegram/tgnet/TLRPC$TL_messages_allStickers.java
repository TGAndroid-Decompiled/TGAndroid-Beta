package org.telegram.tgnet;

public class TLRPC$TL_messages_allStickers extends TLRPC$messages_AllStickers {
    public long hash2;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.hash2 = abstractSerializedData.readInt64(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$StickerSet TLdeserialize = TLRPC$StickerSet.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.sets.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-843329861);
        abstractSerializedData.writeInt64(this.hash2);
        abstractSerializedData.writeInt32(481674261);
        int size = this.sets.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TLRPC$StickerSet) this.sets.get(i)).serializeToStream(abstractSerializedData);
        }
    }
}
