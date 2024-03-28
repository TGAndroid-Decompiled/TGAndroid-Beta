package org.telegram.tgnet;
public class TLRPC$TL_stickers_renameStickerSet extends TLObject {
    public TLRPC$InputStickerSet stickerset;
    public String title;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_StickerSet.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(306912256);
        this.stickerset.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.title);
    }
}
