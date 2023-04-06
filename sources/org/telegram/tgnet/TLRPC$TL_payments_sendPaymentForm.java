package org.telegram.tgnet;
public class TLRPC$TL_payments_sendPaymentForm extends TLObject {
    public static int constructor = 755192367;
    public TLRPC$InputPaymentCredentials credentials;
    public int flags;
    public long form_id;
    public TLRPC$InputInvoice invoice;
    public String requested_info_id;
    public String shipping_option_id;
    public long tip_amount;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$payments_PaymentResult.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.form_id);
        this.invoice.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.requested_info_id);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.shipping_option_id);
        }
        this.credentials.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt64(this.tip_amount);
        }
    }
}
