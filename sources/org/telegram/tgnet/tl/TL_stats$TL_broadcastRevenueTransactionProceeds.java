package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
public class TL_stats$TL_broadcastRevenueTransactionProceeds extends TL_stats$BroadcastRevenueTransaction {
    public long amount;
    public int from_date;
    public int to_date;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.amount = abstractSerializedData.readInt64(z);
        this.from_date = abstractSerializedData.readInt32(z);
        this.to_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1434332356);
        abstractSerializedData.writeInt64(this.amount);
        abstractSerializedData.writeInt32(this.from_date);
        abstractSerializedData.writeInt32(this.to_date);
    }
}
