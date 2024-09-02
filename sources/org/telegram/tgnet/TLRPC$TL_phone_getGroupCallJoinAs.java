package org.telegram.tgnet;

public class TLRPC$TL_phone_getGroupCallJoinAs extends TLObject {
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_phone_joinAsPeers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-277077702);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
