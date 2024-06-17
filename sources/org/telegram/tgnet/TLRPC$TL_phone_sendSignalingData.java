package org.telegram.tgnet;

public class TLRPC$TL_phone_sendSignalingData extends TLObject {
    public byte[] data;
    public TLRPC$TL_inputPhoneCall peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-8744061);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeByteArray(this.data);
    }
}
