package org.telegram.tgnet;
public class TLRPC$TL_inputEncryptedChat extends TLObject {
    public long access_hash;
    public int chat_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat_id = abstractSerializedData.readInt32(z);
        this.access_hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-247351839);
        abstractSerializedData.writeInt32(this.chat_id);
        abstractSerializedData.writeInt64(this.access_hash);
    }
}
