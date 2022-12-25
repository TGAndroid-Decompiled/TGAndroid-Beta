package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$ThemeSettings extends TLObject {
    public int accent_color;
    public TLRPC$BaseTheme base_theme;
    public int flags;
    public ArrayList<Integer> message_colors = new ArrayList<>();
    public boolean message_colors_animated;
    public int outbox_accent_color;
    public TLRPC$WallPaper wallpaper;

    public static TLRPC$ThemeSettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ThemeSettings tLRPC$ThemeSettings;
        if (i == -1917524116) {
            tLRPC$ThemeSettings = new TLRPC$ThemeSettings() {
                public static int constructor = -1917524116;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.message_colors_animated = (readInt32 & 4) != 0;
                    this.base_theme = TLRPC$BaseTheme.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.accent_color = abstractSerializedData2.readInt32(z2);
                    if ((this.flags & 1) != 0) {
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            this.message_colors.add(Integer.valueOf(abstractSerializedData2.readInt32(z2)));
                        }
                    }
                    if ((this.flags & 2) != 0) {
                        this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    int i2 = this.message_colors_animated ? this.flags | 4 : this.flags & (-5);
                    this.flags = i2;
                    abstractSerializedData2.writeInt32(i2);
                    this.base_theme.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(this.accent_color);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.message_colors.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            abstractSerializedData2.writeInt32(this.message_colors.get(i3).intValue());
                        }
                    }
                    if ((this.flags & 2) != 0) {
                        this.wallpaper.serializeToStream(abstractSerializedData2);
                    }
                }
            };
        } else if (i != -1676371894) {
            tLRPC$ThemeSettings = i != -94849324 ? null : new TLRPC$TL_themeSettings();
        } else {
            tLRPC$ThemeSettings = new TLRPC$ThemeSettings() {
                public static int constructor = -1676371894;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32;
                    int readInt322;
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.base_theme = TLRPC$BaseTheme.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.accent_color = abstractSerializedData2.readInt32(z2);
                    if ((this.flags & 1) != 0 && (readInt322 = abstractSerializedData2.readInt32(z2)) != 0) {
                        this.message_colors.add(Integer.valueOf(readInt322));
                    }
                    if ((this.flags & 1) != 0 && (readInt32 = abstractSerializedData2.readInt32(z2)) != 0) {
                        this.message_colors.add(0, Integer.valueOf(readInt32));
                    }
                    if ((this.flags & 2) != 0) {
                        this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(this.flags);
                    this.base_theme.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(this.accent_color);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32(this.message_colors.size() > 1 ? this.message_colors.get(1).intValue() : 0);
                    }
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32(this.message_colors.size() > 0 ? this.message_colors.get(0).intValue() : 0);
                    }
                    if ((this.flags & 2) != 0) {
                        this.wallpaper.serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tLRPC$ThemeSettings == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ThemeSettings", Integer.valueOf(i)));
        }
        if (tLRPC$ThemeSettings != null) {
            tLRPC$ThemeSettings.readParams(abstractSerializedData, z);
        }
        return tLRPC$ThemeSettings;
    }
}
