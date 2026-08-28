package org.telegram.tgnet;
public interface OutputSerializedData {
    int getPosition();

    void skip(int i9);

    void writeBool(boolean z10);

    void writeByte(byte b10);

    void writeByte(int i9);

    void writeByteArray(byte[] bArr);

    void writeByteArray(byte[] bArr, int i9, int i10);

    void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    void writeBytes(byte[] bArr);

    void writeBytes(byte[] bArr, int i9, int i10);

    void writeDouble(double d);

    void writeFloat(float f10);

    void writeInt32(int i9);

    void writeInt64(long j10);

    void writeString(String str);
}
