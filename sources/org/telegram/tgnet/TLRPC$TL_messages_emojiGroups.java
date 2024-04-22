package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messages_emojiGroups extends TLRPC$messages_EmojiGroups {
    public ArrayList<TLRPC$EmojiGroup> groups = new ArrayList<>();
    public int hash;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.hash = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$EmojiGroup TLdeserialize = TLRPC$EmojiGroup.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.groups.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2011186869);
        abstractSerializedData.writeInt32(this.hash);
        abstractSerializedData.writeInt32(481674261);
        int size = this.groups.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.groups.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
