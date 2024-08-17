package org.telegram.tgnet;

public class TLRPC$TL_documentAttributeImageSize extends TLRPC$DocumentAttribute {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.w = abstractSerializedData.readInt32(z);
        this.h = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1815593308);
        abstractSerializedData.writeInt32(this.w);
        abstractSerializedData.writeInt32(this.h);
    }
}
