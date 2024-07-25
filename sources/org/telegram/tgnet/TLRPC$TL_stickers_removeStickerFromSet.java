package org.telegram.tgnet;
public class TLRPC$TL_stickers_removeStickerFromSet extends TLObject {
    public static int constructor = -143257775;
    public TLRPC$InputDocument sticker;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_StickerSet.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.sticker.serializeToStream(abstractSerializedData);
    }
}
