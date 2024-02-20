package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionExportedInviteDelete extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$TL_chatInviteExported invite;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1515256996);
        this.invite.serializeToStream(abstractSerializedData);
    }
}
