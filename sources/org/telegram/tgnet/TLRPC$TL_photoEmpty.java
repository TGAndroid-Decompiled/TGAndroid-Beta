package org.telegram.tgnet;

public class TLRPC$TL_photoEmpty extends TLRPC$Photo {
    public static int constructor = 590459437;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f882id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f882id);
    }
}
