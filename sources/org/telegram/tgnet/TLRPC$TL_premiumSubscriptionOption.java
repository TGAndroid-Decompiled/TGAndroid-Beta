package org.telegram.tgnet;

public class TLRPC$TL_premiumSubscriptionOption extends TLObject {
    public static int constructor = -1225711938;
    public long amount;
    public String bot_url;
    public String currency;
    public int flags;
    public int months;
    public String store_product;

    public static TLRPC$TL_premiumSubscriptionOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_premiumSubscriptionOption", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_premiumSubscriptionOption tLRPC$TL_premiumSubscriptionOption = new TLRPC$TL_premiumSubscriptionOption();
        tLRPC$TL_premiumSubscriptionOption.readParams(abstractSerializedData, z);
        return tLRPC$TL_premiumSubscriptionOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.months = abstractSerializedData.readInt32(z);
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
        this.bot_url = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            this.store_product = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.months);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
        abstractSerializedData.writeString(this.bot_url);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.store_product);
        }
    }
}
