package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantAdmin extends TLRPC$ChannelParticipant {
    public static int constructor = 885242707;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = false;
        this.can_edit = (readInt32 & 1) != 0;
        if ((readInt32 & 2) != 0) {
            z2 = true;
        }
        this.self = z2;
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        this.peer = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = abstractSerializedData.readInt64(z);
        if ((this.flags & 2) != 0) {
            this.inviter_id = abstractSerializedData.readInt64(z);
        }
        this.promoted_by = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 4) != 0) {
            this.rank = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.can_edit ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.self ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.peer.user_id);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt64(this.inviter_id);
        }
        abstractSerializedData.writeInt64(this.promoted_by);
        abstractSerializedData.writeInt32(this.date);
        this.admin_rights.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.rank);
        }
    }
}
