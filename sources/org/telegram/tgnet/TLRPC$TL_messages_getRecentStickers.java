package org.telegram.tgnet;
public class TLRPC$TL_messages_getRecentStickers extends TLObject {
    public static int constructor = -1649852357;
    public boolean attached;
    public int flags;
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_RecentStickers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.attached ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.hash);
    }
}
