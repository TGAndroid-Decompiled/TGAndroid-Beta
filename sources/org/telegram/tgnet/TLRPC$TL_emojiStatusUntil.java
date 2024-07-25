package org.telegram.tgnet;
public class TLRPC$TL_emojiStatusUntil extends TLRPC$EmojiStatus {
    public long document_id;
    public int until;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.document_id = abstractSerializedData.readInt64(z);
        this.until = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-97474361);
        abstractSerializedData.writeInt64(this.document_id);
        abstractSerializedData.writeInt32(this.until);
    }
}
