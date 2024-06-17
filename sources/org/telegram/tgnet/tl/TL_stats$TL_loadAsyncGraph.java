package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stats$TL_loadAsyncGraph extends TLObject {
    public int flags;
    public String token;
    public long x;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1646092192);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.token);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.x);
        }
    }
}
