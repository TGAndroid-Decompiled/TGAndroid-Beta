package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_stats$StatsGraph;
public class TLRPC$TL_payments_starsRevenueStats extends TLObject {
    public TL_stats$StatsGraph revenue_graph;
    public TLRPC$TL_starsRevenueStatus status;
    public double usd_rate;

    public static TLRPC$TL_payments_starsRevenueStats TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-919881925 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_payments_starsRevenueStats", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_payments_starsRevenueStats tLRPC$TL_payments_starsRevenueStats = new TLRPC$TL_payments_starsRevenueStats();
        tLRPC$TL_payments_starsRevenueStats.readParams(abstractSerializedData, z);
        return tLRPC$TL_payments_starsRevenueStats;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.revenue_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.status = TLRPC$TL_starsRevenueStatus.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.usd_rate = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-919881925);
        this.revenue_graph.serializeToStream(abstractSerializedData);
        this.status.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeDouble(this.usd_rate);
    }
}
