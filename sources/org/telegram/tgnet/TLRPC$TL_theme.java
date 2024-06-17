package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_theme extends TLRPC$Theme {
    public long access_hash;
    public boolean creator;
    public TLRPC$Document document;
    public String emoticon;
    public int flags;
    public boolean for_chat;
    public long id;
    public int installs_count;
    public boolean isDefault;
    public ArrayList<TLRPC$ThemeSettings> settings = new ArrayList<>();
    public String slug;
    public String title;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.creator = (readInt32 & 1) != 0;
        this.isDefault = (readInt32 & 2) != 0;
        this.for_chat = (readInt32 & 32) != 0;
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.slug = abstractSerializedData.readString(z);
        this.title = abstractSerializedData.readString(z);
        if ((this.flags & 4) != 0) {
            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 8) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$TL_themeSettings TLdeserialize = TLRPC$TL_themeSettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.settings.add(TLdeserialize);
            }
        }
        if ((this.flags & 64) != 0) {
            this.emoticon = abstractSerializedData.readString(z);
        }
        if ((this.flags & 16) != 0) {
            this.installs_count = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1609668650);
        int i = this.creator ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.isDefault ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.for_chat ? i2 | 32 : i2 & (-33);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeString(this.slug);
        abstractSerializedData.writeString(this.title);
        if ((this.flags & 4) != 0) {
            this.document.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.settings.size();
            abstractSerializedData.writeInt32(size);
            for (int i4 = 0; i4 < size; i4++) {
                this.settings.get(i4).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeString(this.emoticon);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.installs_count);
        }
    }
}
