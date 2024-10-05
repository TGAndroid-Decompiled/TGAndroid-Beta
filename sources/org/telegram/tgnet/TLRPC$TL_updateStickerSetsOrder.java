package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_updateStickerSetsOrder extends TLRPC$Update {
    public boolean emojis;
    public int flags;
    public boolean masks;
    public ArrayList order = new ArrayList();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.masks = (readInt32 & 1) != 0;
        this.emojis = (readInt32 & 2) != 0;
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
        } else {
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                this.order.add(Long.valueOf(abstractSerializedData.readInt64(z)));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(196268545);
        int i = this.masks ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.emojis ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt32(481674261);
        int size = this.order.size();
        abstractSerializedData.writeInt32(size);
        for (int i3 = 0; i3 < size; i3++) {
            abstractSerializedData.writeInt64(((Long) this.order.get(i3)).longValue());
        }
    }
}
