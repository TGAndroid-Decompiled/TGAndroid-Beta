package org.telegram.tgnet;

public abstract class AbstractSerializedData {
    public abstract boolean readBool(boolean z);

    public abstract byte readByte(boolean z);

    public abstract byte[] readByteArray(boolean z);

    public abstract NativeByteBuffer readByteBuffer(boolean z);

    public abstract double readDouble(boolean z);

    public abstract float readFloat(boolean z);

    public abstract int readInt32(boolean z);

    public abstract long readInt64(boolean z);

    public abstract String readString(boolean z);

    public abstract int remaining();

    public abstract void writeBool(boolean z);

    public abstract void writeByte(byte b);

    public abstract void writeByteArray(byte[] bArr);

    public abstract void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    public abstract void writeDouble(double d);

    public abstract void writeFloat(float f);

    public abstract void writeInt32(int i);

    public abstract void writeInt64(long j);

    public abstract void writeString(String str);
}
