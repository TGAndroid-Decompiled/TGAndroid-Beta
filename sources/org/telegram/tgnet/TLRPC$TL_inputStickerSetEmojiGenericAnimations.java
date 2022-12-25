package org.telegram.tgnet;

public class TLRPC$TL_inputStickerSetEmojiGenericAnimations extends TLRPC$InputStickerSet {
    public static int constructor = 80008398;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
