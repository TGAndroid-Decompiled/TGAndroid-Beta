package org.telegram.tgnet;

public class TLRPC$TL_payments_paymentResult extends TLRPC$payments_PaymentResult {
    public TLRPC$Updates updates;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.updates = TLRPC$Updates.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1314881805);
        this.updates.serializeToStream(abstractSerializedData);
    }
}
