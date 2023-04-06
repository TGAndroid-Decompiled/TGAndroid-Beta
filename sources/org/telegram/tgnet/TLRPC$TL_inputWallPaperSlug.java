package org.telegram.tgnet;
public class TLRPC$TL_inputWallPaperSlug extends TLRPC$InputWallPaper {
    public static int constructor = 1913199744;
    public String slug;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.slug = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.slug);
    }
}
