package org.telegram.tgnet;

public class TLRPC$TL_wallPaper extends TLRPC$WallPaper {
    public static int constructor = -1539849235;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f994id = abstractSerializedData.readInt64(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.creator = (readInt32 & 1) != 0;
        this.isDefault = (readInt32 & 2) != 0;
        this.pattern = (readInt32 & 8) != 0;
        this.dark = (readInt32 & 16) != 0;
        this.access_hash = abstractSerializedData.readInt64(z);
        this.slug = abstractSerializedData.readString(z);
        this.document = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 4) != 0) {
            this.settings = TLRPC$WallPaperSettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f994id);
        int i = this.creator ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.isDefault ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.pattern ? i2 | 8 : i2 & (-9);
        this.flags = i3;
        int i4 = this.dark ? i3 | 16 : i3 & (-17);
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeString(this.slug);
        this.document.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            this.settings.serializeToStream(abstractSerializedData);
        }
    }
}
