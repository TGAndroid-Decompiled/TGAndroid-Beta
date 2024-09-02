package org.telegram.tgnet;

public class TLRPC$TL_updateMoveStickerSetToTop extends TLRPC$Update {
    public boolean emojis;
    public int flags;
    public boolean masks;
    public long stickerset;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.masks = (readInt32 & 1) != 0;
        this.emojis = (readInt32 & 2) != 0;
        this.stickerset = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2030252155);
        int i = this.masks ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.emojis ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.stickerset);
    }
}
