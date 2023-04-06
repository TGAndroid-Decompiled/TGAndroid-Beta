package org.telegram.tgnet;
public class TLRPC$TL_channels_getForumTopics extends TLObject {
    public static int constructor = 233136337;
    public TLRPC$InputChannel channel;
    public int flags;
    public int limit;
    public int offset_date;
    public int offset_id;
    public int offset_topic;
    public String q;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_forumTopics.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.channel.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.q);
        }
        abstractSerializedData.writeInt32(this.offset_date);
        abstractSerializedData.writeInt32(this.offset_id);
        abstractSerializedData.writeInt32(this.offset_topic);
        abstractSerializedData.writeInt32(this.limit);
    }
}
