package org.telegram.tgnet;

public class TLRPC$TL_inputStickerSetEmpty extends TLRPC$InputStickerSet {
    public static int constructor = -4838507;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
