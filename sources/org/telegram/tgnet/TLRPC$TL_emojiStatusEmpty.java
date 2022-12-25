package org.telegram.tgnet;

public class TLRPC$TL_emojiStatusEmpty extends TLRPC$EmojiStatus {
    public static int constructor = 769727150;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
