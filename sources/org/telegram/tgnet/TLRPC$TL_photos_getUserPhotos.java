package org.telegram.tgnet;
public class TLRPC$TL_photos_getUserPhotos extends TLObject {
    public int limit;
    public long max_id;
    public int offset;
    public TLRPC$InputUser user_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$photos_Photos.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1848823128);
        this.user_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.offset);
        abstractSerializedData.writeInt64(this.max_id);
        abstractSerializedData.writeInt32(this.limit);
    }
}
