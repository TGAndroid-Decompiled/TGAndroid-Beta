package org.telegram.tgnet;
public class TLRPC$TL_messages_installStickerSet extends TLObject {
    public static int constructor = -946871200;
    public boolean archived;
    public TLRPC$InputStickerSet stickerset;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_StickerSetInstallResult.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.stickerset.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.archived);
    }
}
