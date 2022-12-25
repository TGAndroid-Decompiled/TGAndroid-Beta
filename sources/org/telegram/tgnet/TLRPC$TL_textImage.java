package org.telegram.tgnet;

public class TLRPC$TL_textImage extends TLRPC$RichText {
    public static int constructor = 136105807;
    public long document_id;
    public int f984h;
    public int f985w;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.document_id = abstractSerializedData.readInt64(z);
        this.f985w = abstractSerializedData.readInt32(z);
        this.f984h = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.document_id);
        abstractSerializedData.writeInt32(this.f985w);
        abstractSerializedData.writeInt32(this.f984h);
    }
}
