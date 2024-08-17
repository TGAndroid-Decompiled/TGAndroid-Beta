package org.telegram.tgnet;

public class TLRPC$TL_photoEmpty extends TLRPC$Photo {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(590459437);
        abstractSerializedData.writeInt64(this.id);
    }
}
