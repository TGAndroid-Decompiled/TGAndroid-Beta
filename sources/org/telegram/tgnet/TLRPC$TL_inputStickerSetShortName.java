package org.telegram.tgnet;

public class TLRPC$TL_inputStickerSetShortName extends TLRPC$InputStickerSet {
    public static int constructor = -2044933984;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.short_name = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.short_name);
    }
}
