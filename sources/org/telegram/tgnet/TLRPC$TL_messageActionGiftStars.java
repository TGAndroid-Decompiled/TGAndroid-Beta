package org.telegram.tgnet;
public class TLRPC$TL_messageActionGiftStars extends TLRPC$MessageAction {
    public long stars;
    public String transaction_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
        this.stars = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.cryptoCurrency = abstractSerializedData.readString(z);
            this.cryptoAmount = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 2) != 0) {
            this.transaction_id = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1171632161);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
        abstractSerializedData.writeInt64(this.stars);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.cryptoCurrency);
            abstractSerializedData.writeInt64(this.cryptoAmount);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.transaction_id);
        }
    }
}
