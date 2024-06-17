package org.telegram.tgnet;

public class TLRPC$TL_account_saveWallPaper extends TLObject {
    public TLRPC$TL_wallPaperSettings settings;
    public boolean unsave;
    public TLRPC$InputWallPaper wallpaper;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1817860919);
        this.wallpaper.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.unsave);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
