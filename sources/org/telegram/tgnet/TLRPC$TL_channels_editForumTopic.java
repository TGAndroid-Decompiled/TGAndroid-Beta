package org.telegram.tgnet;
public class TLRPC$TL_channels_editForumTopic extends TLObject {
    public static int constructor = -186670715;
    public TLRPC$InputChannel channel;
    public boolean closed;
    public int flags;
    public boolean hidden;
    public long icon_emoji_id;
    public String title;
    public int topic_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.topic_id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.title);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt64(this.icon_emoji_id);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeBool(this.closed);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeBool(this.hidden);
        }
    }
}
