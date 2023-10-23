package org.telegram.tgnet;
public class TLRPC$TL_decryptedMessageActionAbortKey extends TLRPC$DecryptedMessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.exchange_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-586814357);
        abstractSerializedData.writeInt64(this.exchange_id);
    }
}
