package org.telegram.tgnet;

public class TLRPC$TL_premiumGiftCodeOption extends TLObject {
    public static int constructor = 629052971;
    public long amount;
    public String currency;
    public int flags;
    public int months;
    public String store_product;
    public int store_quantity;
    public int users;

    public static TLRPC$TL_premiumGiftCodeOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_premiumGiftCodeOption", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption = new TLRPC$TL_premiumGiftCodeOption();
        tLRPC$TL_premiumGiftCodeOption.readParams(abstractSerializedData, z);
        return tLRPC$TL_premiumGiftCodeOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.users = abstractSerializedData.readInt32(z);
        this.months = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.store_product = abstractSerializedData.readString(z);
        }
        if ((this.flags & 2) != 0) {
            this.store_quantity = abstractSerializedData.readInt32(z);
        }
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.users);
        abstractSerializedData.writeInt32(this.months);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.store_product);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.store_quantity);
        }
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
    }
}
