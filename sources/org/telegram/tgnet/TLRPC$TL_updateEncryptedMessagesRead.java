package org.telegram.tgnet;

public class TLRPC$TL_updateEncryptedMessagesRead extends TLRPC$Update {
    public int chat_id;
    public int date;
    public int max_date;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat_id = abstractSerializedData.readInt32(z);
        this.max_date = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(956179895);
        abstractSerializedData.writeInt32(this.chat_id);
        abstractSerializedData.writeInt32(this.max_date);
        abstractSerializedData.writeInt32(this.date);
    }
}
