package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;

public class TL_stats$TL_statsGraphError extends TL_stats$StatsGraph {
    public String error;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.error = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1092839390);
        abstractSerializedData.writeString(this.error);
    }
}
