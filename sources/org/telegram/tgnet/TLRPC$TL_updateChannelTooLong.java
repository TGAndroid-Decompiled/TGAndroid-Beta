package org.telegram.tgnet;
public class TLRPC$TL_updateChannelTooLong extends TLRPC$Update {
    public long channel_id;
    public int flags;
    public int pts;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.channel_id = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.pts = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(277713951);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.channel_id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.pts);
        }
    }
}
