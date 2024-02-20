package org.telegram.tgnet;
public class TLRPC$TL_inputStickerSetAnimatedEmoji extends TLRPC$InputStickerSet {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(42402760);
    }
}
