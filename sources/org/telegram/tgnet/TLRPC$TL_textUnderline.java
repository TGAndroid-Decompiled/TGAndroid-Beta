package org.telegram.tgnet;
public class TLRPC$TL_textUnderline extends TLRPC$RichText {
    public static int constructor = -1054465340;
    public TLRPC$RichText text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.text.serializeToStream(abstractSerializedData);
    }
}
