package org.telegram.tgnet;

public class TLRPC$TL_encryptedChat extends TLRPC$EncryptedChat {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt32(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        this.admin_id = abstractSerializedData.readInt64(z);
        this.participant_id = abstractSerializedData.readInt64(z);
        this.g_a_or_b = abstractSerializedData.readByteArray(z);
        this.key_fingerprint = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1643173063);
        abstractSerializedData.writeInt32(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt64(this.admin_id);
        abstractSerializedData.writeInt64(this.participant_id);
        abstractSerializedData.writeByteArray(this.g_a_or_b);
        abstractSerializedData.writeInt64(this.key_fingerprint);
    }
}
