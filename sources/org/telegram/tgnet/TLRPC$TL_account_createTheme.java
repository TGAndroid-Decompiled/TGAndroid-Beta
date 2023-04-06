package org.telegram.tgnet;
public class TLRPC$TL_account_createTheme extends TLObject {
    public static int constructor = -2077048289;
    public TLRPC$InputDocument document;
    public int flags;
    public TLRPC$TL_inputThemeSettings settings;
    public String slug;
    public String title;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Theme.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.slug);
        abstractSerializedData.writeString(this.title);
        if ((this.flags & 4) != 0) {
            this.document.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            this.settings.serializeToStream(abstractSerializedData);
        }
    }
}
