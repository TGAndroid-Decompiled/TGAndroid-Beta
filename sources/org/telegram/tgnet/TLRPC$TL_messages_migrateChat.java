package org.telegram.tgnet;

public class TLRPC$TL_messages_migrateChat extends TLObject {
    public long chat_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1568189671);
        abstractSerializedData.writeInt64(this.chat_id);
    }
}
