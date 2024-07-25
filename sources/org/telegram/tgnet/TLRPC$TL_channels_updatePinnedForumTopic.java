package org.telegram.tgnet;
public class TLRPC$TL_channels_updatePinnedForumTopic extends TLObject {
    public TLRPC$InputChannel channel;
    public boolean pinned;
    public int topic_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1814925350);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.topic_id);
        abstractSerializedData.writeBool(this.pinned);
    }
}
