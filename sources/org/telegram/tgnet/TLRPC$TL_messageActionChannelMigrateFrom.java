package org.telegram.tgnet;

public class TLRPC$TL_messageActionChannelMigrateFrom extends TLRPC$MessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.title = abstractSerializedData.readString(z);
        this.chat_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-365344535);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeInt64(this.chat_id);
    }
}
