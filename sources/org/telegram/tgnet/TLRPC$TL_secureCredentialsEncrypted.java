package org.telegram.tgnet;

public class TLRPC$TL_secureCredentialsEncrypted extends TLObject {
    public byte[] data;
    public byte[] hash;
    public byte[] secret;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.data = abstractSerializedData.readByteArray(z);
        this.hash = abstractSerializedData.readByteArray(z);
        this.secret = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(871426631);
        abstractSerializedData.writeByteArray(this.data);
        abstractSerializedData.writeByteArray(this.hash);
        abstractSerializedData.writeByteArray(this.secret);
    }
}
