package org.telegram.tgnet;
public class TLRPC$TL_updateChannelPinnedTopic extends TLRPC$Update {
    public long channel_id;
    public int flags;
    public boolean pinned;
    public int topic_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.pinned = (readInt32 & 1) != 0;
        this.channel_id = abstractSerializedData.readInt64(z);
        this.topic_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(422509539);
        int i = this.pinned ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.channel_id);
        abstractSerializedData.writeInt32(this.topic_id);
    }
}
