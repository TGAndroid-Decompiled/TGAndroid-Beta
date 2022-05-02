package org.telegram.tgnet;

public class TLRPC$TL_wallPaperNoFile extends TLRPC$WallPaper {
    public static int constructor = -528465642;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f993id = abstractSerializedData.readInt64(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = true;
        this.isDefault = (readInt32 & 2) != 0;
        if ((readInt32 & 16) == 0) {
            z2 = false;
        }
        this.dark = z2;
        if ((readInt32 & 4) != 0) {
            this.settings = TLRPC$WallPaperSettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f993id);
        int i = this.isDefault ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.dark ? i | 16 : i & (-17);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        if ((this.flags & 4) != 0) {
            this.settings.serializeToStream(abstractSerializedData);
        }
    }
}
