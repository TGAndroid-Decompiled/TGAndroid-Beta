package org.telegram.tgnet;
public class TLRPC$TL_messages_unpinAllMessages extends TLObject {
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_affectedHistory.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-265962357);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
