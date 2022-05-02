package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantBanned extends TLRPC$ChannelParticipant {
    public static int constructor = 1844969806;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = true;
        if ((readInt32 & 1) == 0) {
            z2 = false;
        }
        this.left = z2;
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.kicked_by = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        this.banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.left ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.kicked_by);
        abstractSerializedData.writeInt32(this.date);
        this.banned_rights.serializeToStream(abstractSerializedData);
    }
}
