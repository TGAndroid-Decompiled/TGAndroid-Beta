package org.telegram.tgnet;

public class TLRPC$TL_documentAttributeCustomEmoji extends TLRPC$DocumentAttribute {
    public static int constructor = -48981863;
    public boolean free;
    public boolean text_color;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.free = (readInt32 & 1) != 0;
        this.text_color = (readInt32 & 2) != 0;
        this.alt = abstractSerializedData.readString(z);
        this.stickerset = TLRPC$InputStickerSet.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.free ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.text_color ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeString(this.alt);
        this.stickerset.serializeToStream(abstractSerializedData);
    }
}
