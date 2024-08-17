package org.telegram.tgnet;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public abstract class TLRPC$WallPaper extends TLObject {
    public long access_hash;
    public boolean creator;
    public boolean dark;
    public TLRPC$Document document;
    public int flags;
    public long id;
    public boolean isDefault;
    public boolean pattern;
    public TLRPC$WallPaperSettings settings;
    public String slug;
    public Bitmap stripedThumb;
    public Drawable thumbDrawable;
    public String uploadingImage;

    public static TLRPC$WallPaper TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$WallPaper tLRPC$WallPaper;
        if (i == -1963717851) {
            tLRPC$WallPaper = new TLRPC$TL_wallPaperNoFile() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.isDefault = (readInt32 & 2) != 0;
                    this.dark = (readInt32 & 16) != 0;
                    if ((readInt32 & 4) != 0) {
                        this.settings = TLRPC$WallPaperSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1963717851);
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
        } else if (i == -1539849235) {
            tLRPC$WallPaper = new TLRPC$TL_wallPaper();
        } else if (i != -528465642) {
            tLRPC$WallPaper = i != -263220756 ? null : new TLRPC$TL_wallPaper() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.id = abstractSerializedData2.readInt64(z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.creator = (readInt32 & 1) != 0;
                    this.isDefault = (readInt32 & 2) != 0;
                    this.access_hash = abstractSerializedData2.readInt64(z2);
                    this.slug = abstractSerializedData2.readString(z2);
                    this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-263220756);
                    abstractSerializedData2.writeInt64(this.id);
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
        } else {
            tLRPC$WallPaper = new TLRPC$TL_wallPaperNoFile();
        }
        if (tLRPC$WallPaper == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in WallPaper", Integer.valueOf(i)));
        }
        if (tLRPC$WallPaper != null) {
            tLRPC$WallPaper.readParams(abstractSerializedData, z);
        }
        return tLRPC$WallPaper;
    }
}
