package org.telegram.tgnet;
public class TLRPC$TL_account_installWallPaper extends TLObject {
    public static int constructor = -18000023;
    public TLRPC$TL_wallPaperSettings settings;
    public TLRPC$InputWallPaper wallpaper;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.wallpaper.serializeToStream(abstractSerializedData);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
