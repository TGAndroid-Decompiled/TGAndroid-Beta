package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionParticipantJoinByRequest extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = -1347021750;
    public long approved_by;
    public TLRPC$ExportedChatInvite invite;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.approved_by = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.invite.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.approved_by);
    }
}
