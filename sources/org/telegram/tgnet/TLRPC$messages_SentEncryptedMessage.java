package org.telegram.tgnet;
public abstract class TLRPC$messages_SentEncryptedMessage extends TLObject {
    public int date;
    public TLRPC$EncryptedFile file;

    public static TLRPC$messages_SentEncryptedMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_SentEncryptedMessage tLRPC$messages_SentEncryptedMessage;
        if (i != -1802240206) {
            tLRPC$messages_SentEncryptedMessage = i != 1443858741 ? null : new TLRPC$messages_SentEncryptedMessage() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.date = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1443858741);
                    abstractSerializedData2.writeInt32(this.date);
                }
            };
        } else {
            tLRPC$messages_SentEncryptedMessage = new TLRPC$messages_SentEncryptedMessage() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.date = abstractSerializedData2.readInt32(z2);
                    this.file = TLRPC$EncryptedFile.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1802240206);
                    abstractSerializedData2.writeInt32(this.date);
                    this.file.serializeToStream(abstractSerializedData2);
                }
            };
        }
        if (tLRPC$messages_SentEncryptedMessage == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_SentEncryptedMessage", Integer.valueOf(i)));
        }
        if (tLRPC$messages_SentEncryptedMessage != null) {
            tLRPC$messages_SentEncryptedMessage.readParams(abstractSerializedData, z);
        }
        return tLRPC$messages_SentEncryptedMessage;
    }
}
