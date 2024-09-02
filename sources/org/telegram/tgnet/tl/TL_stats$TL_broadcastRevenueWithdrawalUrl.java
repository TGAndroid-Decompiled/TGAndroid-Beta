package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stats$TL_broadcastRevenueWithdrawalUrl extends TLObject {
    public String url;

    public static TL_stats$TL_broadcastRevenueWithdrawalUrl TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-328886473 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stats_broadcastRevenueWithdrawalUrl", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_broadcastRevenueWithdrawalUrl tL_stats$TL_broadcastRevenueWithdrawalUrl = new TL_stats$TL_broadcastRevenueWithdrawalUrl();
        tL_stats$TL_broadcastRevenueWithdrawalUrl.readParams(abstractSerializedData, z);
        return tL_stats$TL_broadcastRevenueWithdrawalUrl;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-328886473);
        abstractSerializedData.writeString(this.url);
    }
}
