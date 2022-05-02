package org.telegram.tgnet;

public class C0944x72c667f extends TLRPC$PasswordKdfAlgo {
    public static int constructor = 982592842;
    public int f954g;
    public byte[] f955p;
    public byte[] salt1;
    public byte[] salt2;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.salt1 = abstractSerializedData.readByteArray(z);
        this.salt2 = abstractSerializedData.readByteArray(z);
        this.f954g = abstractSerializedData.readInt32(z);
        this.f955p = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeByteArray(this.salt1);
        abstractSerializedData.writeByteArray(this.salt2);
        abstractSerializedData.writeInt32(this.f954g);
        abstractSerializedData.writeByteArray(this.f955p);
    }
}
