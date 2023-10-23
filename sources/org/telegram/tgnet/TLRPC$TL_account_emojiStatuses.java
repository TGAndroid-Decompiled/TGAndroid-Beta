package org.telegram.tgnet;
public class TLRPC$TL_account_emojiStatuses extends TLRPC$account_EmojiStatuses {
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
            TLRPC$EmojiStatus TLdeserialize = TLRPC$EmojiStatus.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.statuses.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1866176559);
        abstractSerializedData.writeInt64(this.hash);
        abstractSerializedData.writeInt32(481674261);
        int size = this.statuses.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.statuses.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
