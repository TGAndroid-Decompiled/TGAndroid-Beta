package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_stats$TL_broadcastRevenueTransactions extends TLObject {
    public int count;
    public ArrayList<TL_stats$BroadcastRevenueTransaction> transactions = new ArrayList<>();

    public static TL_stats$TL_broadcastRevenueTransactions TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-2028632986 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stats_broadcastRevenueTransactions", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_broadcastRevenueTransactions tL_stats$TL_broadcastRevenueTransactions = new TL_stats$TL_broadcastRevenueTransactions();
        tL_stats$TL_broadcastRevenueTransactions.readParams(abstractSerializedData, z);
        return tL_stats$TL_broadcastRevenueTransactions;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.count = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.transactions.add(TL_stats$BroadcastRevenueTransaction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2028632986);
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt32(481674261);
        int size = this.transactions.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.transactions.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
