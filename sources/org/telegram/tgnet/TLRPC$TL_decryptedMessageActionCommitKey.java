package org.telegram.tgnet;
public class TLRPC$TL_decryptedMessageActionCommitKey extends TLRPC$DecryptedMessageAction {
    public static int constructor = -332526693;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.exchange_id = abstractSerializedData.readInt64(z);
        this.key_fingerprint = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.exchange_id);
        abstractSerializedData.writeInt64(this.key_fingerprint);
    }
}
