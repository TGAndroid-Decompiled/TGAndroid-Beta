package org.telegram.tgnet;

public class TLRPC$TL_contacts_block extends TLObject {
    public int flags;
    public TLRPC$InputPeer id;
    public boolean my_stories_from;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(774801204);
        int i = this.my_stories_from ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.id.serializeToStream(abstractSerializedData);
    }
}
