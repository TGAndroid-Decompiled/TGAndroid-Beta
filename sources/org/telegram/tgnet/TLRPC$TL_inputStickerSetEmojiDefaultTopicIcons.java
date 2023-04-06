package org.telegram.tgnet;
public class TLRPC$TL_inputStickerSetEmojiDefaultTopicIcons extends TLRPC$InputStickerSet {
    public static int constructor = 1153562857;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
