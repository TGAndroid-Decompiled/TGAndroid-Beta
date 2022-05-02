package org.telegram.tgnet;

public class TLRPC$TL_peerLocated extends TLRPC$PeerLocated {
    public static int constructor = -901375139;
    public int distance;
    public int expires;
    public TLRPC$Peer peer;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.expires = abstractSerializedData.readInt32(z);
        this.distance = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.expires);
        abstractSerializedData.writeInt32(this.distance);
    }
}
