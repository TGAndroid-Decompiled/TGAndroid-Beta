package org.telegram.tgnet;

public class TLRPC$TL_messages_reportSpam extends TLObject {
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-820669733);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
