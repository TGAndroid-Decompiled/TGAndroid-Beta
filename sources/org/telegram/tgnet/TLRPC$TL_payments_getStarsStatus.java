package org.telegram.tgnet;

public class TLRPC$TL_payments_getStarsStatus extends TLObject {
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_payments_starsStatus.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(273665959);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
