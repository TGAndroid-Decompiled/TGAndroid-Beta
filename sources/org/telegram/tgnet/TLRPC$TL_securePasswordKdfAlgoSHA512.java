package org.telegram.tgnet;

public class TLRPC$TL_securePasswordKdfAlgoSHA512 extends TLRPC$SecurePasswordKdfAlgo {
    public static int constructor = -2042159726;
    public byte[] salt;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.salt = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeByteArray(this.salt);
    }
}
