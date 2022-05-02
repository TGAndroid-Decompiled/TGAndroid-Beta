package org.telegram.tgnet;

public class TLRPC$TL_payments_validateRequestedInfo extends TLObject {
    public static int constructor = -619695760;
    public int flags;
    public TLRPC$TL_paymentRequestedInfo info;
    public int msg_id;
    public TLRPC$InputPeer peer;
    public boolean save;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_payments_validatedRequestedInfo.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.save ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.msg_id);
        this.info.serializeToStream(abstractSerializedData);
    }
}
