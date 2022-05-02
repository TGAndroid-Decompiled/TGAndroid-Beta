package org.telegram.tgnet;

public class TLRPC$TL_account_installTheme extends TLObject {
    public static int constructor = 2061776695;
    public boolean dark;
    public int flags;
    public String format;
    public TLRPC$InputTheme theme;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.dark ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.format);
        }
        if ((this.flags & 2) != 0) {
            this.theme.serializeToStream(abstractSerializedData);
        }
    }
}
