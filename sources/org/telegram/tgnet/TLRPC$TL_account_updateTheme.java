package org.telegram.tgnet;
public class TLRPC$TL_account_updateTheme extends TLObject {
    public static int constructor = 1555261397;
    public TLRPC$InputDocument document;
    public int flags;
    public String format;
    public TLRPC$TL_inputThemeSettings settings;
    public String slug;
    public TLRPC$InputTheme theme;
    public String title;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Theme.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.format);
        this.theme.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.slug);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.title);
        }
        if ((this.flags & 4) != 0) {
            this.document.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            this.settings.serializeToStream(abstractSerializedData);
        }
    }
}
