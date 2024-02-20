package org.telegram.tgnet;
public class TLRPC$TL_messages_getStickerSet extends TLObject {
    public int hash;
    public TLRPC$InputStickerSet stickerset;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_StickerSet.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-928977804);
        this.stickerset.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.hash);
    }
}
