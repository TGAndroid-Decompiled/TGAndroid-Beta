package org.telegram.tgnet;

public abstract class AbstractSerializedData implements InputSerializedData, OutputSerializedData {
    private TLDataSourceType dataSourceType = TLDataSourceType.UNKNOWN;

    @Override
    public TLDataSourceType getDataSourceType() {
        return this.dataSourceType;
    }

    @Override
    public abstract int getPosition();

    @Override
    public abstract int length();

    @Override
    public abstract boolean readBool(boolean z10);

    @Override
    public abstract byte readByte(boolean z10);

    @Override
    public abstract byte[] readByteArray(boolean z10);

    @Override
    public abstract NativeByteBuffer readByteBuffer(boolean z10);

    @Override
    public abstract void readBytes(byte[] bArr, boolean z10);

    @Override
    public abstract byte[] readData(int i10, boolean z10);

    @Override
    public abstract double readDouble(boolean z10);

    @Override
    public abstract float readFloat(boolean z10);

    @Override
    public abstract int readInt32(boolean z10);

    @Override
    public abstract long readInt64(boolean z10);

    @Override
    public abstract String readString(boolean z10);

    @Override
    public abstract int remaining();

    public void setDataSourceType(TLDataSourceType tLDataSourceType) {
        this.dataSourceType = tLDataSourceType;
    }

    @Override
    public abstract void skip(int i10);

    @Override
    public abstract void writeBool(boolean z10);

    @Override
    public abstract void writeByte(byte b10);

    @Override
    public abstract void writeByte(int i10);

    @Override
    public abstract void writeByteArray(byte[] bArr);

    @Override
    public abstract void writeByteArray(byte[] bArr, int i10, int i11);

    @Override
    public abstract void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    @Override
    public abstract void writeBytes(byte[] bArr);

    @Override
    public abstract void writeBytes(byte[] bArr, int i10, int i11);

    @Override
    public abstract void writeDouble(double d);

    @Override
    public abstract void writeFloat(float f10);

    @Override
    public abstract void writeInt32(int i10);

    @Override
    public abstract void writeInt64(long j10);

    @Override
    public abstract void writeString(String str);
}
