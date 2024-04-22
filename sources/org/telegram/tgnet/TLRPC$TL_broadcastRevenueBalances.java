package org.telegram.tgnet;
public class TLRPC$TL_broadcastRevenueBalances extends TLObject {
    public long available_balance;
    public long current_balance;
    public long overall_revenue;

    public static TLRPC$TL_broadcastRevenueBalances TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-2076642874 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_broadcastRevenueBalances", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_broadcastRevenueBalances tLRPC$TL_broadcastRevenueBalances = new TLRPC$TL_broadcastRevenueBalances();
        tLRPC$TL_broadcastRevenueBalances.readParams(abstractSerializedData, z);
        return tLRPC$TL_broadcastRevenueBalances;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.current_balance = abstractSerializedData.readInt64(z);
        this.available_balance = abstractSerializedData.readInt64(z);
        this.overall_revenue = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2076642874);
        abstractSerializedData.writeInt64(this.current_balance);
        abstractSerializedData.writeInt64(this.available_balance);
        abstractSerializedData.writeInt64(this.overall_revenue);
    }
}
