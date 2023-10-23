package org.telegram.tgnet;
public class TLRPC$TL_messages_acceptEncryption extends TLObject {
    public byte[] g_b;
    public long key_fingerprint;
    public TLRPC$TL_inputEncryptedChat peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$EncryptedChat.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1035731989);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeByteArray(this.g_b);
        abstractSerializedData.writeInt64(this.key_fingerprint);
    }
}
