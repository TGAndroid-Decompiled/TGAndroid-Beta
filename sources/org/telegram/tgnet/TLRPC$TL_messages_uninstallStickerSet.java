package org.telegram.tgnet;

public class TLRPC$TL_messages_uninstallStickerSet extends TLObject {
    public TLRPC$InputStickerSet stickerset;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-110209570);
        this.stickerset.serializeToStream(abstractSerializedData);
    }
}
