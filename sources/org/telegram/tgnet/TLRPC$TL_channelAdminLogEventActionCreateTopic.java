package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionCreateTopic extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = 1483767080;
    public TLRPC$ForumTopic topic;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.topic = TLRPC$ForumTopic.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.topic.serializeToStream(abstractSerializedData);
    }
}
