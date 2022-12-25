package org.telegram.tgnet;

public class TLRPC$TL_emojiStatus extends TLRPC$EmojiStatus {
    public static int constructor = -1835310691;
    public long document_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.document_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.document_id);
    }
}
