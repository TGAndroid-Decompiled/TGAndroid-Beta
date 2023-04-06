package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionParticipantJoinByInvite extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = -23084712;
    public int flags;
    public TLRPC$TL_chatInviteExported invite;
    public boolean via_chatlist;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.via_chatlist = (readInt32 & 1) != 0;
        this.invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.via_chatlist ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.invite.serializeToStream(abstractSerializedData);
    }
}
