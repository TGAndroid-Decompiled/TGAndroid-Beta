package org.telegram.tgnet;

public class TLRPC$TL_textImage extends TLRPC$RichText {
    public static int constructor = 136105807;
    public long document_id;
    public int f975h;
    public int f976w;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.document_id = abstractSerializedData.readInt64(z);
        this.f976w = abstractSerializedData.readInt32(z);
        this.f975h = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.document_id);
        abstractSerializedData.writeInt32(this.f976w);
        abstractSerializedData.writeInt32(this.f975h);
    }
}
