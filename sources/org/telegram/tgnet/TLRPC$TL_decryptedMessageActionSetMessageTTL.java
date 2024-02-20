package org.telegram.tgnet;
public class TLRPC$TL_decryptedMessageActionSetMessageTTL extends TLRPC$DecryptedMessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.ttl_seconds = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1586283796);
        abstractSerializedData.writeInt32(this.ttl_seconds);
    }
}
