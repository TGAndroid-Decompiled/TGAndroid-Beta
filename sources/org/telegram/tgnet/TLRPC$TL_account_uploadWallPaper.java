package org.telegram.tgnet;
public class TLRPC$TL_account_uploadWallPaper extends TLObject {
    public TLRPC$InputFile file;
    public String mime_type;
    public TLRPC$TL_wallPaperSettings settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$WallPaper.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-578472351);
        this.file.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.mime_type);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
