package org.telegram.tgnet;

public class TLRPC$TL_payments_canPurchasePremium extends TLObject {
    public TLRPC$InputStorePaymentPurpose purpose;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1614700874);
        this.purpose.serializeToStream(abstractSerializedData);
    }
}
