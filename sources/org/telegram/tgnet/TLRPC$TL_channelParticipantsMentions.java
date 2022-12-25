package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantsMentions extends TLRPC$ChannelParticipantsFilter {
    public static int constructor = -531931925;
    public int flags;
    public int top_msg_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.f847q = abstractSerializedData.readString(z);
        }
        if ((this.flags & 2) != 0) {
            this.top_msg_id = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.f847q);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
        }
    }
}
