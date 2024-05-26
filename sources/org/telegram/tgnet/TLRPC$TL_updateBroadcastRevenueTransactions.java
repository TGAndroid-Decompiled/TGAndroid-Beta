package org.telegram.tgnet;
public class TLRPC$TL_updateBroadcastRevenueTransactions extends TLRPC$Update {
    public TLRPC$TL_broadcastRevenueBalances balances;
    public TLRPC$Peer peer;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.balances = TLRPC$TL_broadcastRevenueBalances.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-539401739);
        this.peer.serializeToStream(abstractSerializedData);
        this.balances.serializeToStream(abstractSerializedData);
    }
}
