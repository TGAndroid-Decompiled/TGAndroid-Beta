package org.telegram.tgnet;

public class TLRPC$TL_inputPhotoFileLocation extends TLRPC$InputFileLocation {
    public static int constructor = 1075322878;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f861id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.file_reference = abstractSerializedData.readByteArray(z);
        this.thumb_size = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f861id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeByteArray(this.file_reference);
        abstractSerializedData.writeString(this.thumb_size);
    }
}
