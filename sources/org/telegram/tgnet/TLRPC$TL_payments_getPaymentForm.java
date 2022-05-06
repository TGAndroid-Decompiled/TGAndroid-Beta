package org.telegram.tgnet;

public class TLRPC$TL_payments_getPaymentForm extends TLObject {
    public static int constructor = 924093883;
    public int flags;
    public TLRPC$InputInvoice invoice;
    public TLRPC$TL_dataJSON theme_params;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_payments_paymentForm.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.invoice.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            this.theme_params.serializeToStream(abstractSerializedData);
        }
    }
}
