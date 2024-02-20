package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionDeleteTopic extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$ForumTopic topic;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.topic = TLRPC$ForumTopic.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1374254839);
        this.topic.serializeToStream(abstractSerializedData);
    }
}
