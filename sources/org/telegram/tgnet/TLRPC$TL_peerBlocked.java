package org.telegram.tgnet;

public class TLRPC$TL_peerBlocked extends TLObject {
    public static int constructor = -386039788;
    public int date;
    public TLRPC$Peer peer_id;

    public static TLRPC$TL_peerBlocked TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_peerBlocked tLRPC$TL_peerBlocked = new TLRPC$TL_peerBlocked();
            tLRPC$TL_peerBlocked.readParams(abstractSerializedData, z);
            return tLRPC$TL_peerBlocked;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_peerBlocked", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.date);
    }
}
