package org.telegram.tgnet;
public abstract class TLRPC$PeerLocated extends TLObject {
    public static TLRPC$PeerLocated TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PeerLocated tLRPC$TL_peerLocated;
        if (i != -901375139) {
            tLRPC$TL_peerLocated = i != -118740917 ? null : new TLRPC$TL_peerSelfLocated();
        } else {
            tLRPC$TL_peerLocated = new TLRPC$TL_peerLocated();
        }
        if (tLRPC$TL_peerLocated == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PeerLocated", Integer.valueOf(i)));
        }
        if (tLRPC$TL_peerLocated != null) {
            tLRPC$TL_peerLocated.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_peerLocated;
    }
}
