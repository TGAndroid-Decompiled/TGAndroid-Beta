package org.telegram.tgnet;

public abstract class TLRPC$PeerLocated extends TLObject {
    public static TLRPC$PeerLocated TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PeerLocated tLRPC$TL_peerSelfLocated = i != -901375139 ? i != -118740917 ? null : new TLRPC$TL_peerSelfLocated() : new TLRPC$TL_peerLocated();
        if (tLRPC$TL_peerSelfLocated == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PeerLocated", Integer.valueOf(i)));
        }
        if (tLRPC$TL_peerSelfLocated != null) {
            tLRPC$TL_peerSelfLocated.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_peerSelfLocated;
    }
}
