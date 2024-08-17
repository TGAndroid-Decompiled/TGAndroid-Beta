package org.telegram.tgnet;

public class TLRPC$TL_channels_getSendAs extends TLObject {
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_channels_sendAsPeers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(231174382);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
