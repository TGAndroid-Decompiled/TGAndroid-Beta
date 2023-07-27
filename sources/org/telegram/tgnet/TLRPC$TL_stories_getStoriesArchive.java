package org.telegram.tgnet;
public class TLRPC$TL_stories_getStoriesArchive extends TLObject {
    public static int constructor = 526108114;
    public int limit;
    public int offset_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_stories_stories.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.offset_id);
        abstractSerializedData.writeInt32(this.limit);
    }
}
