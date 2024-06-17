package org.telegram.tgnet;

public class TLRPC$TL_notifyPeer extends TLRPC$NotifyPeer {
    public TLRPC$Peer peer;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1613493288);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
