package org.telegram.tgnet;
public class TLRPC$TL_inputStickerSetEmojiGenericAnimations extends TLRPC$InputStickerSet {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(80008398);
    }
}
