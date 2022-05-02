package org.telegram.tgnet;

public abstract class TLRPC$WallPaper extends TLObject {
    public long access_hash;
    public boolean creator;
    public boolean dark;
    public TLRPC$Document document;
    public int flags;
    public long f982id;
    public boolean isDefault;
    public boolean pattern;
    public TLRPC$WallPaperSettings settings;
    public String slug;

    public static TLRPC$WallPaper TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$WallPaper tLRPC$WallPaper;
        switch (i) {
            case -1963717851:
                tLRPC$WallPaper = new TLRPC$TL_wallPaperNoFile() {
                    public static int constructor = -1963717851;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = true;
                        this.isDefault = (readInt32 & 2) != 0;
                        if ((readInt32 & 16) == 0) {
                            z3 = false;
                        }
                        this.dark = z3;
                        if ((readInt32 & 4) != 0) {
                            this.settings = TLRPC$WallPaperSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.isDefault ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.dark ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        if ((this.flags & 4) != 0) {
                            this.settings.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1539849235:
                tLRPC$WallPaper = new TLRPC$TL_wallPaper();
                break;
            case -528465642:
                tLRPC$WallPaper = new TLRPC$TL_wallPaperNoFile();
                break;
            case -263220756:
                tLRPC$WallPaper = new TLRPC$TL_wallPaper() {
                    public static int constructor = -263220756;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f982id = abstractSerializedData2.readInt64(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.creator = (readInt32 & 1) != 0;
                        if ((readInt32 & 2) != 0) {
                            z3 = true;
                        }
                        this.isDefault = z3;
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.slug = abstractSerializedData2.readString(z2);
                        this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.f982id);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.isDefault ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.slug);
                        this.document.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            default:
                tLRPC$WallPaper = null;
                break;
        }
        if (tLRPC$WallPaper != null || !z) {
            if (tLRPC$WallPaper != null) {
                tLRPC$WallPaper.readParams(abstractSerializedData, z);
            }
            return tLRPC$WallPaper;
        }
        throw new RuntimeException(String.format("can't parse magic %x in WallPaper", Integer.valueOf(i)));
    }
}
