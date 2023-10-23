package org.telegram.tgnet;
public class TLRPC$TL_inputThemeSlug extends TLRPC$InputTheme {
    public String slug;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.slug = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-175567375);
        abstractSerializedData.writeString(this.slug);
    }
}
