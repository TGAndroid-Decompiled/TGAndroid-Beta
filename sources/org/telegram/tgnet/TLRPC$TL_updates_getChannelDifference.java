package org.telegram.tgnet;
public class TLRPC$TL_updates_getChannelDifference extends TLObject {
    public TLRPC$InputChannel channel;
    public TLRPC$ChannelMessagesFilter filter;
    public int flags;
    public boolean force;
    public int limit;
    public int pts;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$updates_ChannelDifference.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(51854712);
        int i = this.force ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.channel.serializeToStream(abstractSerializedData);
        serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.pts);
        abstractSerializedData.writeInt32(this.limit);
    }
}
