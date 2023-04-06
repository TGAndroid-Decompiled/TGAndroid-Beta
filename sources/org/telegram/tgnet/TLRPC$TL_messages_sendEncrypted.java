package org.telegram.tgnet;
public class TLRPC$TL_messages_sendEncrypted extends TLObject {
    public static int constructor = 1157265941;
    public NativeByteBuffer data;
    public int flags;
    public TLRPC$TL_inputEncryptedChat peer;
    public long random_id;
    public boolean silent;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_SentEncryptedMessage.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.silent ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.random_id);
        abstractSerializedData.writeByteBuffer(this.data);
    }

    @Override
    public void freeResources() {
        NativeByteBuffer nativeByteBuffer = this.data;
        if (nativeByteBuffer != null) {
            nativeByteBuffer.reuse();
            this.data = null;
        }
    }
}
