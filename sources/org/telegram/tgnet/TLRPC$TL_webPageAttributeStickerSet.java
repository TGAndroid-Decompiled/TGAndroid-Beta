package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_webPageAttributeStickerSet extends TLRPC$WebPageAttribute {
    public boolean emojis;
    public ArrayList stickers = new ArrayList();
    public boolean text_color;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.emojis = (readInt32 & 1) != 0;
        this.text_color = (readInt32 & 2) != 0;
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$Document TLdeserialize = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.stickers.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1355547603);
        int i = this.emojis ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.text_color ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt32(481674261);
        int size = this.stickers.size();
        abstractSerializedData.writeInt32(size);
        for (int i3 = 0; i3 < size; i3++) {
            ((TLRPC$Document) this.stickers.get(i3)).serializeToStream(abstractSerializedData);
        }
    }
}
