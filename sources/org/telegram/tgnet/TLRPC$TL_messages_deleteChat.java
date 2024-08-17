package org.telegram.tgnet;

public class TLRPC$TL_messages_deleteChat extends TLObject {
    public long chat_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1540419152);
        abstractSerializedData.writeInt64(this.chat_id);
    }
}
