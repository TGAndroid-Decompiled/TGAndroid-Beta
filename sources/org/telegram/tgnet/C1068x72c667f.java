package org.telegram.tgnet;

public class C1068x72c667f extends TLRPC$PasswordKdfAlgo {
    public static int constructor = 982592842;
    public int f966g;
    public byte[] f967p;
    public byte[] salt1;
    public byte[] salt2;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.salt1 = abstractSerializedData.readByteArray(z);
        this.salt2 = abstractSerializedData.readByteArray(z);
        this.f966g = abstractSerializedData.readInt32(z);
        this.f967p = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeByteArray(this.salt1);
        abstractSerializedData.writeByteArray(this.salt2);
        abstractSerializedData.writeInt32(this.f966g);
        abstractSerializedData.writeByteArray(this.f967p);
    }
}
