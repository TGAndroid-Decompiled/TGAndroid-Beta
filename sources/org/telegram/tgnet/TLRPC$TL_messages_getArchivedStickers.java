package org.telegram.tgnet;
public class TLRPC$TL_messages_getArchivedStickers extends TLObject {
    public static int constructor = 1475442322;
    public boolean emojis;
    public int flags;
    public int limit;
    public boolean masks;
    public long offset_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_archivedStickers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.masks ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.emojis ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.offset_id);
        abstractSerializedData.writeInt32(this.limit);
    }
}
