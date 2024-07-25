package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_emojiList extends TLRPC$EmojiList {
    public ArrayList<Long> document_id = new ArrayList<>();
    public long hash;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.hash = abstractSerializedData.readInt64(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.document_id.add(Long.valueOf(abstractSerializedData.readInt64(z)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2048790993);
        abstractSerializedData.writeInt64(this.hash);
        abstractSerializedData.writeInt32(481674261);
        int size = this.document_id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt64(this.document_id.get(i).longValue());
        }
    }
}
