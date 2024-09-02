package org.telegram.tgnet;

public class TLRPC$TL_account_updateColor extends TLObject {
    public long background_emoji_id;
    public int color;
    public int flags;
    public boolean for_profile;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2096079197);
        int i = this.for_profile ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.color);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.background_emoji_id);
        }
    }
}
