package org.telegram.tgnet;

public class TLRPC$TL_messageActionGiftPremium extends TLRPC$MessageAction {
    public TLRPC$TL_textWithEntities message;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
        this.months = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.cryptoCurrency = abstractSerializedData.readString(z);
            this.cryptoAmount = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 2) != 0) {
            this.message = TLRPC$TL_textWithEntities.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1818391802);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
        abstractSerializedData.writeInt32(this.months);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.cryptoCurrency);
            abstractSerializedData.writeInt64(this.cryptoAmount);
        }
        if ((this.flags & 2) != 0) {
            this.message.serializeToStream(abstractSerializedData);
        }
    }
}
