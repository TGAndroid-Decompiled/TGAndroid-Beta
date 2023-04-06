package org.telegram.tgnet;
public class TLRPC$TL_inputStickerSetPremiumGifts extends TLRPC$InputStickerSet {
    public static int constructor = -930399486;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
