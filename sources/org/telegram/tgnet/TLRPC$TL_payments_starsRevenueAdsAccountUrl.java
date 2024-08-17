package org.telegram.tgnet;

public class TLRPC$TL_payments_starsRevenueAdsAccountUrl extends TLObject {
    public String url;

    public static TLRPC$TL_payments_starsRevenueAdsAccountUrl TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (961445665 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_payments_starsRevenueWithdrawalUrl", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_payments_starsRevenueAdsAccountUrl tLRPC$TL_payments_starsRevenueAdsAccountUrl = new TLRPC$TL_payments_starsRevenueAdsAccountUrl();
        tLRPC$TL_payments_starsRevenueAdsAccountUrl.readParams(abstractSerializedData, z);
        return tLRPC$TL_payments_starsRevenueAdsAccountUrl;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(961445665);
        abstractSerializedData.writeString(this.url);
    }
}
