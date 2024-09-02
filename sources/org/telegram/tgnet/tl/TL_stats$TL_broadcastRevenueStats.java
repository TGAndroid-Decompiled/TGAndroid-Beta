package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BroadcastRevenueBalances;

public class TL_stats$TL_broadcastRevenueStats extends TLObject {
    public TLRPC$BroadcastRevenueBalances balances;
    public TL_stats$StatsGraph revenue_graph;
    public TL_stats$StatsGraph top_hours_graph;
    public double usd_rate;

    public static TL_stats$TL_broadcastRevenueStats TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1409802903 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stats_broadcastRevenueStats", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_broadcastRevenueStats tL_stats$TL_broadcastRevenueStats = new TL_stats$TL_broadcastRevenueStats();
        tL_stats$TL_broadcastRevenueStats.readParams(abstractSerializedData, z);
        return tL_stats$TL_broadcastRevenueStats;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.top_hours_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.revenue_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.balances = TLRPC$BroadcastRevenueBalances.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.usd_rate = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1409802903);
        this.top_hours_graph.serializeToStream(abstractSerializedData);
        this.revenue_graph.serializeToStream(abstractSerializedData);
        this.balances.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeDouble(this.usd_rate);
    }
}
