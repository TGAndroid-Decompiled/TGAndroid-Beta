package org.telegram.tgnet;
public class TLRPC$TL_inputStickerSetAnimatedEmoji extends TLRPC$InputStickerSet {
    public static int constructor = 42402760;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
