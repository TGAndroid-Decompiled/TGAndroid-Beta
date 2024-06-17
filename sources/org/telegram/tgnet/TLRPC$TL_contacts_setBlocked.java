package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_contacts_setBlocked extends TLObject {
    public int flags;
    public ArrayList<TLRPC$InputPeer> id = new ArrayList<>();
    public int limit;
    public boolean my_stories_from;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1798939530);
        int i = this.my_stories_from ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(this.id.size());
        for (int i2 = 0; i2 < this.id.size(); i2++) {
            this.id.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.limit);
    }
}
