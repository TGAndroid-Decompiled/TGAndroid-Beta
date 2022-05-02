package org.telegram.tgnet;

public class C1005x72c667f extends TLRPC$PasswordKdfAlgo {
    public static int constructor = 982592842;
    public int f965g;
    public byte[] f966p;
    public byte[] salt1;
    public byte[] salt2;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.salt1 = abstractSerializedData.readByteArray(z);
        this.salt2 = abstractSerializedData.readByteArray(z);
        this.f965g = abstractSerializedData.readInt32(z);
        this.f966p = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeByteArray(this.salt1);
        abstractSerializedData.writeByteArray(this.salt2);
        abstractSerializedData.writeInt32(this.f965g);
        abstractSerializedData.writeByteArray(this.f966p);
    }
}
