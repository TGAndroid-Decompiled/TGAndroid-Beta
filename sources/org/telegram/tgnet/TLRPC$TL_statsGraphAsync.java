package org.telegram.tgnet;
public class TLRPC$TL_statsGraphAsync extends TLRPC$StatsGraph {
    public String token;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.token = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1244130093);
        abstractSerializedData.writeString(this.token);
    }
}
