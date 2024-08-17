package org.telegram.tgnet;

public class TLRPC$TL_updateChannelMessageForwards extends TLRPC$Update {
    public long channel_id;
    public int forwards;
    public int id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel_id = abstractSerializedData.readInt64(z);
        this.id = abstractSerializedData.readInt32(z);
        this.forwards = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-761649164);
        abstractSerializedData.writeInt64(this.channel_id);
        abstractSerializedData.writeInt32(this.id);
        abstractSerializedData.writeInt32(this.forwards);
    }
}
