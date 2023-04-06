package org.telegram.tgnet;
public class TLRPC$TL_updateEncryptedChatTyping extends TLRPC$Update {
    public static int constructor = 386986326;
    public int chat_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.chat_id);
    }
}
