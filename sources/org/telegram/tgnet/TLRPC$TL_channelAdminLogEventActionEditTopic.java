package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionEditTopic extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$ForumTopic new_topic;
    public TLRPC$ForumTopic prev_topic;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.prev_topic = TLRPC$ForumTopic.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_topic = TLRPC$ForumTopic.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-261103096);
        this.prev_topic.serializeToStream(abstractSerializedData);
        this.new_topic.serializeToStream(abstractSerializedData);
    }
}
