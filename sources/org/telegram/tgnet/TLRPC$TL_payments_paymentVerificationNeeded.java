package org.telegram.tgnet;
public class TLRPC$TL_payments_paymentVerificationNeeded extends TLRPC$payments_PaymentResult {
    public String url;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-666824391);
        abstractSerializedData.writeString(this.url);
    }
}
