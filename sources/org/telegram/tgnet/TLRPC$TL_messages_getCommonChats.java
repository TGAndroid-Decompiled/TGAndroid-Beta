package org.telegram.tgnet;
public class TLRPC$TL_messages_getCommonChats extends TLObject {
    public int limit;
    public long max_id;
    public TLRPC$InputUser user_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_Chats.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-468934396);
        this.user_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.max_id);
        abstractSerializedData.writeInt32(this.limit);
    }
}
