package org.telegram.tgnet;
public class TLRPC$TL_updateChat extends TLRPC$Update {
    public static int constructor = -124097970;
    public long chat_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.chat_id);
    }
}
