package org.telegram.tgnet;

public class TLRPC$TL_inputStickerSetItem extends TLObject {
    public static int constructor = -6249322;
    public TLRPC$InputDocument document;
    public String emoji;
    public int flags;
    public TLRPC$TL_maskCoords mask_coords;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.document = TLRPC$InputDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.emoji = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            this.mask_coords = TLRPC$TL_maskCoords.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.document.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.emoji);
        if ((this.flags & 1) != 0) {
            this.mask_coords.serializeToStream(abstractSerializedData);
        }
    }
}
