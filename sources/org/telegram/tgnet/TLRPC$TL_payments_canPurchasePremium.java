package org.telegram.tgnet;

public class TLRPC$TL_payments_canPurchasePremium extends TLObject {
    public static int constructor = -1614700874;
    public TLRPC$InputStorePaymentPurpose purpose;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.purpose.serializeToStream(abstractSerializedData);
    }
}
