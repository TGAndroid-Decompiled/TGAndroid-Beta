package org.telegram.tgnet;
public class TLRPC$TL_updatePeerBlocked extends TLRPC$Update {
    public static int constructor = 610945826;
    public boolean blocked;
    public TLRPC$Peer peer_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.blocked = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.blocked);
    }
}
