package org.telegram.tgnet;
public class TLRPC$TL_starsSubscriptionPricing extends TLObject {
    public long amount;
    public int period;

    public static TLRPC$TL_starsSubscriptionPricing TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (88173912 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_starsSubscriptionPricing", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_starsSubscriptionPricing tLRPC$TL_starsSubscriptionPricing = new TLRPC$TL_starsSubscriptionPricing();
        tLRPC$TL_starsSubscriptionPricing.readParams(abstractSerializedData, z);
        return tLRPC$TL_starsSubscriptionPricing;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.period = abstractSerializedData.readInt32(z);
        this.amount = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(88173912);
        abstractSerializedData.writeInt32(this.period);
        abstractSerializedData.writeInt64(this.amount);
    }
}
