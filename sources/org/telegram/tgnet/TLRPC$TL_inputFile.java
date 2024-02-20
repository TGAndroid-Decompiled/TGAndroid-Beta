package org.telegram.tgnet;
public class TLRPC$TL_inputFile extends TLRPC$InputFile {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.parts = abstractSerializedData.readInt32(z);
        this.name = abstractSerializedData.readString(z);
        this.md5_checksum = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-181407105);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt32(this.parts);
        abstractSerializedData.writeString(this.name);
        abstractSerializedData.writeString(this.md5_checksum);
    }
}
