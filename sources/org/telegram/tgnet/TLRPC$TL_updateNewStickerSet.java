package org.telegram.tgnet;
public class TLRPC$TL_updateNewStickerSet extends TLRPC$Update {
    public TLRPC$TL_messages_stickerSet stickerset;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.stickerset = TLRPC$messages_StickerSet.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1753886890);
        this.stickerset.serializeToStream(abstractSerializedData);
    }
}
