package org.telegram.tgnet;

public class TLRPC$TL_payments_sendStarsForm extends TLObject {
    public int flags;
    public long form_id;
    public TLRPC$InputInvoice invoice;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$payments_PaymentResult.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(45839133);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.form_id);
        this.invoice.serializeToStream(abstractSerializedData);
    }
}
