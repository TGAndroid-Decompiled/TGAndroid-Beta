package org.telegram.tgnet;

public class C1132x72c667f extends TLRPC$PasswordKdfAlgo {
    public static int constructor = 982592842;
    public int f975g;
    public byte[] f976p;
    public byte[] salt1;
    public byte[] salt2;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.salt1 = abstractSerializedData.readByteArray(z);
        this.salt2 = abstractSerializedData.readByteArray(z);
        this.f975g = abstractSerializedData.readInt32(z);
        this.f976p = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeByteArray(this.salt1);
        abstractSerializedData.writeByteArray(this.salt2);
        abstractSerializedData.writeInt32(this.f975g);
        abstractSerializedData.writeByteArray(this.f976p);
    }
}
