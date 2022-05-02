package org.telegram.tgnet;

public class TLRPC$TL_inputCheckPasswordSRP extends TLRPC$InputCheckPasswordSRP {
    public static int constructor = -763367294;
    public byte[] f900A;
    public byte[] f901M1;
    public long srp_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.srp_id = abstractSerializedData.readInt64(z);
        this.f900A = abstractSerializedData.readByteArray(z);
        this.f901M1 = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.srp_id);
        abstractSerializedData.writeByteArray(this.f900A);
        abstractSerializedData.writeByteArray(this.f901M1);
    }
}
