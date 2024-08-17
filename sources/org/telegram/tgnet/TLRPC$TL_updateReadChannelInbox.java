package org.telegram.tgnet;

public class TLRPC$TL_updateReadChannelInbox extends TLRPC$Update {
    public long channel_id;
    public int flags;
    public int folder_id;
    public int max_id;
    public int pts;
    public int still_unread_count;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.folder_id = abstractSerializedData.readInt32(z);
        }
        this.channel_id = abstractSerializedData.readInt64(z);
        this.max_id = abstractSerializedData.readInt32(z);
        this.still_unread_count = abstractSerializedData.readInt32(z);
        this.pts = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1842450928);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.folder_id);
        }
        abstractSerializedData.writeInt64(this.channel_id);
        abstractSerializedData.writeInt32(this.max_id);
        abstractSerializedData.writeInt32(this.still_unread_count);
        abstractSerializedData.writeInt32(this.pts);
    }
}
