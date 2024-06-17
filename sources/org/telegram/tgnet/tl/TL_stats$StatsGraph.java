package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_stats$StatsGraph extends TLObject {
    public float rate;

    public static TL_stats$StatsGraph TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stats$StatsGraph tL_stats$TL_statsGraph;
        if (i == -1901828938) {
            tL_stats$TL_statsGraph = new TL_stats$TL_statsGraph();
        } else if (i != -1092839390) {
            tL_stats$TL_statsGraph = i != 1244130093 ? null : new TL_stats$TL_statsGraphAsync();
        } else {
            tL_stats$TL_statsGraph = new TL_stats$TL_statsGraphError();
        }
        if (tL_stats$TL_statsGraph == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StatsGraph", Integer.valueOf(i)));
        }
        if (tL_stats$TL_statsGraph != null) {
            tL_stats$TL_statsGraph.readParams(abstractSerializedData, z);
        }
        return tL_stats$TL_statsGraph;
    }
}
