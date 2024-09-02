package org.telegram.tgnet;

public class TLRPC$TL_account_disablePeerConnectedBot extends TLObject {
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1581481689);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
