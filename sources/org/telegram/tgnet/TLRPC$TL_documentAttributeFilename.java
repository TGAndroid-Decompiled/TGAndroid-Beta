package org.telegram.tgnet;
public class TLRPC$TL_documentAttributeFilename extends TLRPC$DocumentAttribute {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.file_name = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(358154344);
        abstractSerializedData.writeString(this.file_name);
    }
}
