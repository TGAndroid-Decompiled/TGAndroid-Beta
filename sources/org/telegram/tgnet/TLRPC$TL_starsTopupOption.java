package org.telegram.tgnet;

public class TLRPC$TL_starsTopupOption extends TLObject {
    public long amount;
    public boolean collapsed;
    public String currency;
    public int flags;
    public boolean loadingStorePrice;
    public long stars;
    public String store_product;

    public static TLRPC$TL_starsTopupOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (198776256 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_starsTopupOption", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption = new TLRPC$TL_starsTopupOption();
        tLRPC$TL_starsTopupOption.readParams(abstractSerializedData, z);
        return tLRPC$TL_starsTopupOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.stars = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.store_product = abstractSerializedData.readString(z);
        }
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(198776256);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.stars);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.store_product);
        }
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
    }
}
