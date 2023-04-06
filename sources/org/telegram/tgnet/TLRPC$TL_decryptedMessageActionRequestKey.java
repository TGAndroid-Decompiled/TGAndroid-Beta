package org.telegram.tgnet;
public class TLRPC$TL_decryptedMessageActionRequestKey extends TLRPC$DecryptedMessageAction {
    public static int constructor = -204906213;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.exchange_id = abstractSerializedData.readInt64(z);
        this.g_a = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.exchange_id);
        abstractSerializedData.writeByteArray(this.g_a);
    }
}
