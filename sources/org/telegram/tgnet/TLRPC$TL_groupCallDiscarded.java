package org.telegram.tgnet;

public class TLRPC$TL_groupCallDiscarded extends TLRPC$GroupCall {
    public static int constructor = 2004925620;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f868id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.duration = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f868id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeInt32(this.duration);
    }
}
