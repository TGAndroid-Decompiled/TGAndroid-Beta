package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantSelf extends TLRPC$ChannelParticipant {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.via_invite = (readInt32 & 1) != 0;
        this.user_id = abstractSerializedData.readInt64(z);
        this.inviter_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(900251559);
        int i = this.via_invite ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt64(this.inviter_id);
        abstractSerializedData.writeInt32(this.date);
    }
}
