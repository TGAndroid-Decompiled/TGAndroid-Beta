package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
public class TL_stats$TL_broadcastRevenueTransactionWithdrawal extends TL_stats$BroadcastRevenueTransaction {
    public long amount;
    public int date;
    public boolean failed;
    public int flags;
    public boolean pending;
    public String provider;
    public int transaction_date;
    public String transaction_url;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.pending = (readInt32 & 1) != 0;
        this.failed = (readInt32 & 4) != 0;
        this.amount = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        this.provider = abstractSerializedData.readString(z);
        if ((this.flags & 2) != 0) {
            this.transaction_date = abstractSerializedData.readInt32(z);
            this.transaction_url = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1515784568);
        int i = this.pending ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        this.flags = this.failed ? i | 1 : i & (-2);
        abstractSerializedData.writeInt64(this.amount);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeString(this.provider);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.transaction_date);
            abstractSerializedData.writeString(this.transaction_url);
        }
    }
}
