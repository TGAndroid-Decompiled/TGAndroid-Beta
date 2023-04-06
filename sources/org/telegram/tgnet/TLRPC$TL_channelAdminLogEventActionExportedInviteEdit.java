package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionExportedInviteEdit extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = -384910503;
    public TLRPC$TL_chatInviteExported new_invite;
    public TLRPC$TL_chatInviteExported prev_invite;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.prev_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.prev_invite.serializeToStream(abstractSerializedData);
        this.new_invite.serializeToStream(abstractSerializedData);
    }
}
