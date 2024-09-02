package org.telegram.tgnet;

public class TLRPC$TL_messages_getPeerSettings extends TLObject {
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_peerSettings.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-270948702);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
