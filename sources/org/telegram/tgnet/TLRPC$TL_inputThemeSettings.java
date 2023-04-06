package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_inputThemeSettings extends TLObject {
    public static int constructor = -1881255857;
    public int accent_color;
    public TLRPC$BaseTheme base_theme;
    public int flags;
    public ArrayList<Integer> message_colors = new ArrayList<>();
    public boolean message_colors_animated;
    public int outbox_accent_color;
    public TLRPC$InputWallPaper wallpaper;
    public TLRPC$WallPaperSettings wallpaper_settings;

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
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                this.message_colors.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
            }
        }
        if ((this.flags & 2) != 0) {
            this.wallpaper = TLRPC$InputWallPaper.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.wallpaper_settings = TLRPC$WallPaperSettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
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
        if ((this.flags & 2) != 0) {
            this.wallpaper_settings.serializeToStream(abstractSerializedData);
        }
    }
}
