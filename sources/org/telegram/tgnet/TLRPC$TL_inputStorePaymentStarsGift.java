package org.telegram.tgnet;
public class TLRPC$TL_inputStorePaymentStarsGift extends TLRPC$InputStorePaymentPurpose {
    public long amount;
    public String currency;
    public long stars;
    public TLRPC$InputUser user_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = TLRPC$InputUser.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.stars = abstractSerializedData.readInt64(z);
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(494149367);
        this.user_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.stars);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
    }
}
