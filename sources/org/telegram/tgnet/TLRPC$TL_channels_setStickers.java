package org.telegram.tgnet;
public class TLRPC$TL_channels_setStickers extends TLObject {
    public static int constructor = -359881479;
    public TLRPC$InputChannel channel;
    public TLRPC$InputStickerSet stickerset;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
        this.stickerset.serializeToStream(abstractSerializedData);
    }
}
