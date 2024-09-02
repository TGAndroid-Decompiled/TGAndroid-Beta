package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stats$TL_messageStats extends TLObject {
    public TL_stats$StatsGraph reactions_by_emotion_graph;
    public TL_stats$StatsGraph views_graph;

    public static TL_stats$TL_messageStats TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (2145983508 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stats_messageStats", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_messageStats tL_stats$TL_messageStats = new TL_stats$TL_messageStats();
        tL_stats$TL_messageStats.readParams(abstractSerializedData, z);
        return tL_stats$TL_messageStats;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.views_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.reactions_by_emotion_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2145983508);
        this.views_graph.serializeToStream(abstractSerializedData);
        this.reactions_by_emotion_graph.serializeToStream(abstractSerializedData);
    }
}
