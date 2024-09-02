package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;

public class TL_stats$TL_statsGraphAsync extends TL_stats$StatsGraph {
    public String token;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.token = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1244130093);
        abstractSerializedData.writeString(this.token);
    }
}
