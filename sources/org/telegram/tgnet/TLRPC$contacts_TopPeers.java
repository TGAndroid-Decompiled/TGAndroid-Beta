package org.telegram.tgnet;

public abstract class TLRPC$contacts_TopPeers extends TLObject {
    public static TLRPC$contacts_TopPeers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$contacts_TopPeers tLRPC$TL_contacts_topPeers = i != -1255369827 ? i != -567906571 ? i != 1891070632 ? null : new TLRPC$TL_contacts_topPeers() : new TLRPC$contacts_TopPeers() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-567906571);
            }
        } : new TLRPC$contacts_TopPeers() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1255369827);
            }
        };
        if (tLRPC$TL_contacts_topPeers == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in contacts_TopPeers", Integer.valueOf(i)));
        }
        if (tLRPC$TL_contacts_topPeers != null) {
            tLRPC$TL_contacts_topPeers.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_contacts_topPeers;
    }
}
