package org.telegram.tgnet;
public abstract class TLRPC$WallPaperSettings extends TLObject {
    public int background_color;
    public boolean blur;
    public int flags;
    public int fourth_background_color;
    public int intensity;
    public boolean motion;
    public int rotation;
    public int second_background_color;
    public int third_background_color;

    public static TLRPC$WallPaperSettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings;
        if (i == -1590738760) {
            tLRPC$TL_wallPaperSettings = new TLRPC$TL_wallPaperSettings() {
                public static int constructor = -1590738760;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.blur = (readInt32 & 2) != 0;
                    this.motion = (readInt32 & 4) != 0;
                    if ((readInt32 & 1) != 0) {
                        this.background_color = abstractSerializedData2.readInt32(z2);
                    }
                    if ((this.flags & 8) != 0) {
                        this.intensity = abstractSerializedData2.readInt32(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    int i2 = this.blur ? this.flags | 2 : this.flags & (-3);
                    this.flags = i2;
                    int i3 = this.motion ? i2 | 4 : i2 & (-5);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32(this.background_color);
                    }
                    if ((this.flags & 8) != 0) {
                        abstractSerializedData2.writeInt32(this.intensity);
                    }
                }
            };
        } else if (i == 84438264) {
            tLRPC$TL_wallPaperSettings = new TLRPC$TL_wallPaperSettings() {
                public static int constructor = 84438264;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.blur = (readInt32 & 2) != 0;
                    this.motion = (readInt32 & 4) != 0;
                    if ((readInt32 & 1) != 0) {
                        this.background_color = abstractSerializedData2.readInt32(z2);
                    }
                    if ((this.flags & 16) != 0) {
                        this.second_background_color = abstractSerializedData2.readInt32(z2);
                    }
                    if ((this.flags & 8) != 0) {
                        this.intensity = abstractSerializedData2.readInt32(z2);
                    }
                    if ((this.flags & 16) != 0) {
                        this.rotation = abstractSerializedData2.readInt32(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    int i2 = this.blur ? this.flags | 2 : this.flags & (-3);
                    this.flags = i2;
                    int i3 = this.motion ? i2 | 4 : i2 & (-5);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32(this.background_color);
                    }
                    if ((this.flags & 16) != 0) {
                        abstractSerializedData2.writeInt32(this.second_background_color);
                    }
                    if ((this.flags & 8) != 0) {
                        abstractSerializedData2.writeInt32(this.intensity);
                    }
                    if ((this.flags & 16) != 0) {
                        abstractSerializedData2.writeInt32(this.rotation);
                    }
                }
            };
        } else {
            tLRPC$TL_wallPaperSettings = i != 499236004 ? null : new TLRPC$TL_wallPaperSettings();
        }
        if (tLRPC$TL_wallPaperSettings == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in WallPaperSettings", Integer.valueOf(i)));
        }
        if (tLRPC$TL_wallPaperSettings != null) {
            tLRPC$TL_wallPaperSettings.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_wallPaperSettings;
    }
}
