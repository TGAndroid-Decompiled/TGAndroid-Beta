package org.telegram.tgnet;

public class TLRPC$TL_account_reportPeer extends TLObject {
    public String message;
    public TLRPC$InputPeer peer;
    public TLRPC$ReportReason reason;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-977650298);
        this.peer.serializeToStream(abstractSerializedData);
        serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.message);
    }
}
