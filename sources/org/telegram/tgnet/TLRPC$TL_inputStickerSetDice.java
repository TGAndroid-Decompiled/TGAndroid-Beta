package org.telegram.tgnet;

public class TLRPC$TL_inputStickerSetDice extends TLRPC$InputStickerSet {
    public String emoticon;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.emoticon = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-427863538);
        abstractSerializedData.writeString(this.emoticon);
    }
}
