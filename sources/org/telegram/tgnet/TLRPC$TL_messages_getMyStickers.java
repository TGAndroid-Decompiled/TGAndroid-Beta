package org.telegram.tgnet;

public class TLRPC$TL_messages_getMyStickers extends TLObject {
    public int limit;
    public long offset_id;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-793386500);
        abstractSerializedData.writeInt64(this.offset_id);
        abstractSerializedData.writeInt32(this.limit);
    }

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_myStickers.TLdeserialize(abstractSerializedData, i, z);
    }
}
