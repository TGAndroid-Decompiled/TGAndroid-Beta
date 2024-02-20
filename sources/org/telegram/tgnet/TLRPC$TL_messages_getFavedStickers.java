package org.telegram.tgnet;
public class TLRPC$TL_messages_getFavedStickers extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_FavedStickers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(82946729);
        abstractSerializedData.writeInt64(this.hash);
    }
}
