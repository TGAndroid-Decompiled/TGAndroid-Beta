package org.telegram.tgnet;

public class TLRPC$TL_emojiStatusEmpty extends TLRPC$EmojiStatus {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(769727150);
    }
}
