package org.telegram.tgnet;

public class TLRPC$TL_inputStickerSetEmojiDefaultStatuses extends TLRPC$InputStickerSet {
    public static int constructor = 701560302;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
