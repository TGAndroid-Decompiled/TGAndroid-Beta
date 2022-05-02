package org.telegram.tgnet;

public class TLRPC$TL_inputFileBig extends TLRPC$InputFile {
    public static int constructor = -95482955;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f871id = abstractSerializedData.readInt64(z);
        this.parts = abstractSerializedData.readInt32(z);
        this.name = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f871id);
        abstractSerializedData.writeInt32(this.parts);
        abstractSerializedData.writeString(this.name);
    }
}
