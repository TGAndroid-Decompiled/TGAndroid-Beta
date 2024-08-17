package org.telegram.tgnet;

public class TLRPC$TL_updateChatDefaultBannedRights extends TLRPC$Update {
    public TLRPC$TL_chatBannedRights default_banned_rights;
    public TLRPC$Peer peer;
    public int version;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.default_banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.version = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1421875280);
        this.peer.serializeToStream(abstractSerializedData);
        this.default_banned_rights.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.version);
    }
}
