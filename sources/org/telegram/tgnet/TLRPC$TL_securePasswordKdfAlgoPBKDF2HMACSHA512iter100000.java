package org.telegram.tgnet;

public class TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 extends TLRPC$SecurePasswordKdfAlgo {
    public byte[] salt;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.salt = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1141711456);
        abstractSerializedData.writeByteArray(this.salt);
    }
}
