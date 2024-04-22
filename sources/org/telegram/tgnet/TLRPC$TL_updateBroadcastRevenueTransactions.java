package org.telegram.tgnet;
public class TLRPC$TL_updateBroadcastRevenueTransactions extends TLRPC$Update {
    public TLRPC$TL_broadcastRevenueBalances balances;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.balances = TLRPC$TL_broadcastRevenueBalances.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1550177112);
        this.balances.serializeToStream(abstractSerializedData);
    }
}
