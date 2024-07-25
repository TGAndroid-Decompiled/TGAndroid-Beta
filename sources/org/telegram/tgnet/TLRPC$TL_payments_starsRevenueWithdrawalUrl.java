package org.telegram.tgnet;
public class TLRPC$TL_payments_starsRevenueWithdrawalUrl extends TLObject {
    public String url;

    public static TLRPC$TL_payments_starsRevenueWithdrawalUrl TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (497778871 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_payments_starsRevenueWithdrawalUrl", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_payments_starsRevenueWithdrawalUrl tLRPC$TL_payments_starsRevenueWithdrawalUrl = new TLRPC$TL_payments_starsRevenueWithdrawalUrl();
        tLRPC$TL_payments_starsRevenueWithdrawalUrl.readParams(abstractSerializedData, z);
        return tLRPC$TL_payments_starsRevenueWithdrawalUrl;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(497778871);
        abstractSerializedData.writeString(this.url);
    }
}
