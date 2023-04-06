package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionDefaultBannedRights extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = 771095562;
    public TLRPC$TL_chatBannedRights new_banned_rights;
    public TLRPC$TL_chatBannedRights prev_banned_rights;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.prev_banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.prev_banned_rights.serializeToStream(abstractSerializedData);
        this.new_banned_rights.serializeToStream(abstractSerializedData);
    }
}
