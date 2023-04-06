package org.telegram.tgnet;
public class TLRPC$TL_channels_editBanned extends TLObject {
    public static int constructor = -1763259007;
    public TLRPC$TL_chatBannedRights banned_rights;
    public TLRPC$InputChannel channel;
    public TLRPC$InputPeer participant;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
        this.participant.serializeToStream(abstractSerializedData);
        this.banned_rights.serializeToStream(abstractSerializedData);
    }
}
