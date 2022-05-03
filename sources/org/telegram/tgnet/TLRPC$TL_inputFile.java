package org.telegram.tgnet;

public class TLRPC$TL_inputFile extends TLRPC$InputFile {
    public static int constructor = -181407105;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.parts = abstractSerializedData.readInt32(z);
        this.name = abstractSerializedData.readString(z);
        this.md5_checksum = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt32(this.parts);
        abstractSerializedData.writeString(this.name);
        abstractSerializedData.writeString(this.md5_checksum);
    }
}
