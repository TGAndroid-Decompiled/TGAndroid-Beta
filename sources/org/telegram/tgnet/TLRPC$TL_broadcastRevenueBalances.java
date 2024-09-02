package org.telegram.tgnet;

public class TLRPC$TL_broadcastRevenueBalances extends TLRPC$BroadcastRevenueBalances {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.withdrawal_enabled = (readInt32 & 1) != 0;
        this.current_balance = abstractSerializedData.readInt64(z);
        this.available_balance = abstractSerializedData.readInt64(z);
        this.overall_revenue = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1006669337);
        int i = this.withdrawal_enabled ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.current_balance);
        abstractSerializedData.writeInt64(this.available_balance);
        abstractSerializedData.writeInt64(this.overall_revenue);
    }
}
