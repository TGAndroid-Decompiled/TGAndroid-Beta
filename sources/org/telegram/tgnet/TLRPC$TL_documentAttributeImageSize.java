package org.telegram.tgnet;

public class TLRPC$TL_documentAttributeImageSize extends TLRPC$DocumentAttribute {
    public static int constructor = 1815593308;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f859w = abstractSerializedData.readInt32(z);
        this.f858h = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.f859w);
        abstractSerializedData.writeInt32(this.f858h);
    }
}
