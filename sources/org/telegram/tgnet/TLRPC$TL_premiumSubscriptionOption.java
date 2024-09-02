package org.telegram.tgnet;

public class TLRPC$TL_premiumSubscriptionOption extends TLObject {
    public long amount;
    public String bot_url;
    public boolean can_purchase_upgrade;
    public String currency;
    public boolean current;
    public int flags;
    public int months;
    public String store_product;
    public String transaction;

    public static TLRPC$TL_premiumSubscriptionOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_premiumSubscriptionOption tLRPC$TL_premiumSubscriptionOption;
        if (i != -1225711938) {
            tLRPC$TL_premiumSubscriptionOption = i != 1596792306 ? null : new TLRPC$TL_premiumSubscriptionOption();
        } else {
            tLRPC$TL_premiumSubscriptionOption = new TLRPC$TL_premiumSubscriptionOption() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.months = abstractSerializedData2.readInt32(z2);
                    this.currency = abstractSerializedData2.readString(z2);
                    this.amount = abstractSerializedData2.readInt64(z2);
                    this.bot_url = abstractSerializedData2.readString(z2);
                    if ((this.flags & 1) != 0) {
                        this.store_product = abstractSerializedData2.readString(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1225711938);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeInt32(this.months);
                    abstractSerializedData2.writeString(this.currency);
                    abstractSerializedData2.writeInt64(this.amount);
                    abstractSerializedData2.writeString(this.bot_url);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeString(this.store_product);
                    }
                }
            };
        }
        if (tLRPC$TL_premiumSubscriptionOption == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in TL_premiumSubscriptionOption", Integer.valueOf(i)));
        }
        if (tLRPC$TL_premiumSubscriptionOption != null) {
            tLRPC$TL_premiumSubscriptionOption.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_premiumSubscriptionOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.current = (readInt32 & 2) != 0;
        if ((readInt32 & 8) != 0) {
            this.transaction = abstractSerializedData.readString(z);
        }
        this.can_purchase_upgrade = (this.flags & 4) != 0;
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
        abstractSerializedData.writeInt32(1596792306);
        int i = this.current ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.can_purchase_upgrade ? i | 4 : i & (-5);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.transaction);
        }
        abstractSerializedData.writeInt32(this.months);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
        abstractSerializedData.writeString(this.bot_url);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.store_product);
        }
    }
}
