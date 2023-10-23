package org.telegram.tgnet;
public class TLRPC$TL_inputStorePaymentGiftPremium extends TLRPC$InputStorePaymentPurpose {
    public long amount;
    public String currency;
    public TLRPC$InputUser user_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = TLRPC$InputUser.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1634697192);
        this.user_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
    }
}
