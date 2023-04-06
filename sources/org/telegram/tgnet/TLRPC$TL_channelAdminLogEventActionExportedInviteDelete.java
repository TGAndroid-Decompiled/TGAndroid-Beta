package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionExportedInviteDelete extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = 1515256996;
    public TLRPC$TL_chatInviteExported invite;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.invite.serializeToStream(abstractSerializedData);
    }
}
