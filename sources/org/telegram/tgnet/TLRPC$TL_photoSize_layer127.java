package org.telegram.tgnet;

public class TLRPC$TL_photoSize_layer127 extends TLRPC$TL_photoSize {
    public static int constructor = 2009052699;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = abstractSerializedData.readString(z);
        this.location = TLRPC$FileLocation.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.f884w = abstractSerializedData.readInt32(z);
        this.f883h = abstractSerializedData.readInt32(z);
        this.size = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.type);
        this.location.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.f884w);
        abstractSerializedData.writeInt32(this.f883h);
        abstractSerializedData.writeInt32(this.size);
    }
}
