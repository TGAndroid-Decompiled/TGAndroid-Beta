package org.telegram.tgnet;

public class TLRPC$TL_updateChannel extends TLRPC$Update {
    public long channel_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1666927625);
        abstractSerializedData.writeInt64(this.channel_id);
    }
}
