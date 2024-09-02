package org.telegram.tgnet;

public class TLRPC$TL_stickers_removeStickerFromSet extends TLObject {
    public TLRPC$InputDocument sticker;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_StickerSet.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-143257775);
        this.sticker.serializeToStream(abstractSerializedData);
    }
}
