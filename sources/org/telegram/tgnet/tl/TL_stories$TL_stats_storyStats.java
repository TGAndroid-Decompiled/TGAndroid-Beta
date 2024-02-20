package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$StatsGraph;
public class TL_stories$TL_stats_storyStats extends TLObject {
    public TLRPC$StatsGraph reactions_by_emotion_graph;
    public TLRPC$StatsGraph views_graph;

    public static TL_stories$TL_stats_storyStats TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1355613820 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stats_storyStats", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_stats_storyStats tL_stories$TL_stats_storyStats = new TL_stories$TL_stats_storyStats();
        tL_stories$TL_stats_storyStats.readParams(abstractSerializedData, z);
        return tL_stories$TL_stats_storyStats;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.views_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.reactions_by_emotion_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1355613820);
        this.views_graph.serializeToStream(abstractSerializedData);
        this.reactions_by_emotion_graph.serializeToStream(abstractSerializedData);
    }
}
