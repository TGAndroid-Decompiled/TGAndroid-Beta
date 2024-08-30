package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_stats$BroadcastRevenueTransaction extends TLObject {
    public static TL_stats$BroadcastRevenueTransaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stats$BroadcastRevenueTransaction tL_stats$TL_broadcastRevenueTransactionWithdrawal = i != 1121127726 ? i != 1434332356 ? i != 1515784568 ? null : new TL_stats$TL_broadcastRevenueTransactionWithdrawal() : new TL_stats$TL_broadcastRevenueTransactionProceeds() : new TL_stats$TL_broadcastRevenueTransactionRefund();
        if (tL_stats$TL_broadcastRevenueTransactionWithdrawal == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BroadcastRevenueTransaction", Integer.valueOf(i)));
        }
        if (tL_stats$TL_broadcastRevenueTransactionWithdrawal != null) {
            tL_stats$TL_broadcastRevenueTransactionWithdrawal.readParams(abstractSerializedData, z);
        }
        return tL_stats$TL_broadcastRevenueTransactionWithdrawal;
    }
}
