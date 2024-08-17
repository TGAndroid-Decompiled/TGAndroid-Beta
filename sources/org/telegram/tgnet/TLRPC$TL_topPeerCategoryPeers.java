package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_topPeerCategoryPeers extends TLObject {
    public TLRPC$TopPeerCategory category;
    public int count;
    public ArrayList<TLRPC$TL_topPeer> peers = new ArrayList<>();

    public static TLRPC$TL_topPeerCategoryPeers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-75283823 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_topPeerCategoryPeers", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_topPeerCategoryPeers tLRPC$TL_topPeerCategoryPeers = new TLRPC$TL_topPeerCategoryPeers();
        tLRPC$TL_topPeerCategoryPeers.readParams(abstractSerializedData, z);
        return tLRPC$TL_topPeerCategoryPeers;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.category = TLRPC$TopPeerCategory.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.count = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_topPeer TLdeserialize = TLRPC$TL_topPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.peers.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-75283823);
        this.category.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt32(481674261);
        int size = this.peers.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.peers.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
