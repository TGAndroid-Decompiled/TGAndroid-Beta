package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_stats$TL_broadcastRevenueStats extends TLObject {
    public long available_balance;
    public long current_balance;
    public long overall_revenue;
    public TL_stats$StatsGraph revenue_graph;
    public TL_stats$StatsGraph top_hours_graph;
    public double usd_rate;

    public static TL_stats$TL_broadcastRevenueStats TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-797226067 != i) {
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
        this.current_balance = abstractSerializedData.readInt64(z);
        this.available_balance = abstractSerializedData.readInt64(z);
        this.overall_revenue = abstractSerializedData.readInt64(z);
        this.usd_rate = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-797226067);
        this.top_hours_graph.serializeToStream(abstractSerializedData);
        this.revenue_graph.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.current_balance);
        abstractSerializedData.writeInt64(this.available_balance);
        abstractSerializedData.writeInt64(this.overall_revenue);
        abstractSerializedData.writeDouble(this.usd_rate);
    }
}
