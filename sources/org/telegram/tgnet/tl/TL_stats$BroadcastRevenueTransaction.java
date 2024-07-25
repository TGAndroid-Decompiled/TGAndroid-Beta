package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_stats$BroadcastRevenueTransaction extends TLObject {
    public static TL_stats$BroadcastRevenueTransaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stats$BroadcastRevenueTransaction tL_stats$TL_broadcastRevenueTransactionRefund;
        if (i == 1121127726) {
            tL_stats$TL_broadcastRevenueTransactionRefund = new TL_stats$TL_broadcastRevenueTransactionRefund();
        } else if (i == 1434332356) {
            tL_stats$TL_broadcastRevenueTransactionRefund = new TL_stats$TL_broadcastRevenueTransactionProceeds();
        } else {
            tL_stats$TL_broadcastRevenueTransactionRefund = i != 1515784568 ? null : new TL_stats$TL_broadcastRevenueTransactionWithdrawal();
        }
        if (tL_stats$TL_broadcastRevenueTransactionRefund == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BroadcastRevenueTransaction", Integer.valueOf(i)));
        }
        if (tL_stats$TL_broadcastRevenueTransactionRefund != null) {
            tL_stats$TL_broadcastRevenueTransactionRefund.readParams(abstractSerializedData, z);
        }
        return tL_stats$TL_broadcastRevenueTransactionRefund;
    }
}
