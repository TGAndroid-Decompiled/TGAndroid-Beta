package org.telegram.tgnet;

public class TLRPC$TL_themeSettings extends TLRPC$ThemeSettings {
    public static TLRPC$TL_themeSettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-94849324 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_themeSettings", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_themeSettings tLRPC$TL_themeSettings = new TLRPC$TL_themeSettings();
        tLRPC$TL_themeSettings.readParams(abstractSerializedData, z);
        return tLRPC$TL_themeSettings;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.message_colors_animated = (readInt32 & 4) != 0;
        this.base_theme = TLRPC$BaseTheme.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.accent_color = abstractSerializedData.readInt32(z);
        if ((this.flags & 8) != 0) {
            this.outbox_accent_color = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            } else {
                int readInt323 = abstractSerializedData.readInt32(z);
                for (int i = 0; i < readInt323; i++) {
                    this.message_colors.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
                }
            }
        }
        if ((this.flags & 2) != 0) {
            this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-94849324);
        int i = this.message_colors_animated ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.base_theme.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.accent_color);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(this.outbox_accent_color);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.message_colors.size();
            abstractSerializedData.writeInt32(size);
            for (int i2 = 0; i2 < size; i2++) {
                abstractSerializedData.writeInt32(this.message_colors.get(i2).intValue());
            }
        }
        if ((this.flags & 2) != 0) {
            this.wallpaper.serializeToStream(abstractSerializedData);
        }
    }
}
