package org.telegram.tgnet;

public class TLRPC$TL_statsGraphError extends TLRPC$StatsGraph {
    public static int constructor = -1092839390;
    public String error;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.error = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.error);
    }
}
