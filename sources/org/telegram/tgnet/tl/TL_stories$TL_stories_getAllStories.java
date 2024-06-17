package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stories$TL_stories_getAllStories extends TLObject {
    public int flags;
    public boolean include_hidden;
    public boolean next;
    public String state;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TL_stories$stories_AllStories.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-290400731);
        int i = this.next ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.include_hidden ? i | 4 : i & (-5);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.state);
        }
    }
}
