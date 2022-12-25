package org.telegram.tgnet;

public class TLRPC$TL_encryptedChatDiscarded extends TLRPC$EncryptedChat {
    public static int constructor = 505183301;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.history_deleted = (readInt32 & 1) != 0;
        this.f860id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.history_deleted ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.f860id);
    }
}
