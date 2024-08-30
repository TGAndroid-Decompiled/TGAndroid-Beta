package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_stats$StatsGraph extends TLObject {
    public float rate;

    public static TL_stats$StatsGraph TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stats$StatsGraph tL_stats$TL_statsGraphAsync = i != -1901828938 ? i != -1092839390 ? i != 1244130093 ? null : new TL_stats$TL_statsGraphAsync() : new TL_stats$TL_statsGraphError() : new TL_stats$TL_statsGraph();
        if (tL_stats$TL_statsGraphAsync == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StatsGraph", Integer.valueOf(i)));
        }
        if (tL_stats$TL_statsGraphAsync != null) {
            tL_stats$TL_statsGraphAsync.readParams(abstractSerializedData, z);
        }
        return tL_stats$TL_statsGraphAsync;
    }
}
