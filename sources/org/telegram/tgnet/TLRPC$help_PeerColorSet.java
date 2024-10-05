package org.telegram.tgnet;

public abstract class TLRPC$help_PeerColorSet extends TLObject {
    public static TLRPC$help_PeerColorSet TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_PeerColorSet tLRPC$TL_help_peerColorProfileSet = i != 639736408 ? i != 1987928555 ? null : new TLRPC$TL_help_peerColorProfileSet() : new TLRPC$TL_help_peerColorSet();
        if (tLRPC$TL_help_peerColorProfileSet == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in help_PeerColorSet", Integer.valueOf(i)));
        }
        if (tLRPC$TL_help_peerColorProfileSet != null) {
            tLRPC$TL_help_peerColorProfileSet.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_help_peerColorProfileSet;
    }
}
