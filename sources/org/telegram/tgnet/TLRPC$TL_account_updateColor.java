package org.telegram.tgnet;
public class TLRPC$TL_account_updateColor extends TLObject {
    public long background_emoji_id;
    public int color;
    public int flags;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1610494909);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.color);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.background_emoji_id);
        }
    }
}
