package org.telegram.tgnet;

public class TLRPC$TL_topPeer extends TLObject {
    public TLRPC$Peer peer;
    public double rating;

    public static TLRPC$TL_topPeer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-305282981 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_topPeer", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_topPeer tLRPC$TL_topPeer = new TLRPC$TL_topPeer();
        tLRPC$TL_topPeer.readParams(abstractSerializedData, z);
        return tLRPC$TL_topPeer;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.rating = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-305282981);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeDouble(this.rating);
    }
}
