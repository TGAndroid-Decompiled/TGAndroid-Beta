package org.telegram.tgnet;

public abstract class TLRPC$BroadcastRevenueBalances extends TLObject {
    public long available_balance;
    public long current_balance;
    public int flags;
    public long overall_revenue;
    public boolean withdrawal_enabled;

    public static TLRPC$BroadcastRevenueBalances TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_broadcastRevenueBalances tLRPC$TL_broadcastRevenueBalances = i != -2076642874 ? i != -1006669337 ? null : new TLRPC$TL_broadcastRevenueBalances() : new TLRPC$TL_broadcastRevenueBalances() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.current_balance = abstractSerializedData2.readInt64(z2);
                this.available_balance = abstractSerializedData2.readInt64(z2);
                this.overall_revenue = abstractSerializedData2.readInt64(z2);
                this.withdrawal_enabled = true;
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-2076642874);
                abstractSerializedData2.writeInt64(this.current_balance);
                abstractSerializedData2.writeInt64(this.available_balance);
                abstractSerializedData2.writeInt64(this.overall_revenue);
            }
        };
        if (tLRPC$TL_broadcastRevenueBalances == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BroadcastRevenueBalances", Integer.valueOf(i)));
        }
        if (tLRPC$TL_broadcastRevenueBalances != null) {
            tLRPC$TL_broadcastRevenueBalances.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_broadcastRevenueBalances;
    }
}
