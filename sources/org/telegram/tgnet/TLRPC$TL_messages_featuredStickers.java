package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messages_featuredStickers extends TLRPC$messages_FeaturedStickers {
    public static int constructor = -1103615738;
    public int count;
    public int flags;
    public long hash;
    public boolean premium;
    public ArrayList<TLRPC$StickerSetCovered> sets = new ArrayList<>();
    public ArrayList<Long> unread = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.premium = (readInt32 & 1) != 0;
        this.hash = abstractSerializedData.readInt64(z);
        this.count = abstractSerializedData.readInt32(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$StickerSetCovered TLdeserialize = TLRPC$StickerSetCovered.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.sets.add(TLdeserialize);
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        if (readInt324 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
            }
            return;
        }
        int readInt325 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt325; i2++) {
            this.unread.add(Long.valueOf(abstractSerializedData.readInt64(z)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.premium ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.hash);
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt32(481674261);
        int size = this.sets.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.sets.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.unread.size();
        abstractSerializedData.writeInt32(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            abstractSerializedData.writeInt64(this.unread.get(i3).longValue());
        }
    }
}
