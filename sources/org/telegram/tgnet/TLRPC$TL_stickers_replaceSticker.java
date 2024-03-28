package org.telegram.tgnet;
public class TLRPC$TL_stickers_replaceSticker extends TLObject {
    public TLRPC$TL_inputStickerSetItem new_sticker;
    public TLRPC$InputDocument sticker;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_StickerSet.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1184253338);
        this.sticker.serializeToStream(abstractSerializedData);
        this.new_sticker.serializeToStream(abstractSerializedData);
    }
}
