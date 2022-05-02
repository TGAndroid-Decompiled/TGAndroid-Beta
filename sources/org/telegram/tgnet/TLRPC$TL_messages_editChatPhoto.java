package org.telegram.tgnet;

public class TLRPC$TL_messages_editChatPhoto extends TLObject {
    public static int constructor = 903730804;
    public long chat_id;
    public TLRPC$InputChatPhoto photo;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.chat_id);
        this.photo.serializeToStream(abstractSerializedData);
    }
}
