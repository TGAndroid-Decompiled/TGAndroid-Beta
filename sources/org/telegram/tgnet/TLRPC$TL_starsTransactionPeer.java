package org.telegram.tgnet;

public class TLRPC$TL_starsTransactionPeer extends TLRPC$StarsTransactionPeer {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-670195363);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
