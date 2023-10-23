package org.telegram.tgnet;
public class TLRPC$TL_phone_receivedCall extends TLObject {
    public TLRPC$TL_inputPhoneCall peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(399855457);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
