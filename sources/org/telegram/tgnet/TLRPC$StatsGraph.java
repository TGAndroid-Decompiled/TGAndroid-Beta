package org.telegram.tgnet;

public abstract class TLRPC$StatsGraph extends TLObject {
    public static TLRPC$StatsGraph TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$StatsGraph tLRPC$TL_statsGraph;
        if (i == -1901828938) {
            tLRPC$TL_statsGraph = new TLRPC$TL_statsGraph();
        } else if (i != -1092839390) {
            tLRPC$TL_statsGraph = i != 1244130093 ? null : new TLRPC$TL_statsGraphAsync();
        } else {
            tLRPC$TL_statsGraph = new TLRPC$TL_statsGraphError();
        }
        if (tLRPC$TL_statsGraph == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StatsGraph", Integer.valueOf(i)));
        }
        if (tLRPC$TL_statsGraph != null) {
            tLRPC$TL_statsGraph.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_statsGraph;
    }
}
