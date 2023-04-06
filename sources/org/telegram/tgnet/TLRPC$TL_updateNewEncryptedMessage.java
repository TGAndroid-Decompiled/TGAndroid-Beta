package org.telegram.tgnet;
public class TLRPC$TL_updateNewEncryptedMessage extends TLRPC$Update {
    public static int constructor = 314359194;
    public TLRPC$EncryptedMessage message;
    public int qts;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.message = TLRPC$EncryptedMessage.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.qts = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.message.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.qts);
    }
}
