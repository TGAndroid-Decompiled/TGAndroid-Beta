package org.telegram.tgnet;

public class TLRPC$TL_updateEncryption extends TLRPC$Update {
    public static int constructor = -1264392051;
    public TLRPC$EncryptedChat chat;
    public int date;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat = TLRPC$EncryptedChat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.chat.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.date);
    }
}
