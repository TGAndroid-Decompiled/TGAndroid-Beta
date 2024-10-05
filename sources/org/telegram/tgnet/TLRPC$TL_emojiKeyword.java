package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_emojiKeyword extends TLRPC$EmojiKeyword {
    public ArrayList emoticons = new ArrayList();
    public String keyword;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.keyword = abstractSerializedData.readString(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
        } else {
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                this.emoticons.add(abstractSerializedData.readString(z));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-709641735);
        abstractSerializedData.writeString(this.keyword);
        abstractSerializedData.writeInt32(481674261);
        int size = this.emoticons.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeString((String) this.emoticons.get(i));
        }
    }
}
