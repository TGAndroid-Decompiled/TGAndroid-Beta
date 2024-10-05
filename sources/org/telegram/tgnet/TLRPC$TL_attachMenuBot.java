package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_attachMenuBot extends TLRPC$AttachMenuBot {
    public long bot_id;
    public int flags;
    public boolean has_settings;
    public boolean inactive;
    public boolean request_write_access;
    public String short_name;
    public boolean show_in_attach_menu;
    public boolean show_in_side_menu;
    public boolean side_menu_disclaimer_needed;
    public ArrayList peer_types = new ArrayList();
    public ArrayList icons = new ArrayList();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.inactive = (readInt32 & 1) != 0;
        this.has_settings = (readInt32 & 2) != 0;
        this.request_write_access = (readInt32 & 4) != 0;
        this.show_in_attach_menu = (readInt32 & 8) != 0;
        this.show_in_side_menu = (readInt32 & 16) != 0;
        this.side_menu_disclaimer_needed = (readInt32 & 32) != 0;
        this.bot_id = abstractSerializedData.readInt64(z);
        this.short_name = abstractSerializedData.readString(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$AttachMenuPeerType TLdeserialize = TLRPC$AttachMenuPeerType.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.peer_types.add(TLdeserialize);
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        if (readInt324 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
            }
            return;
        }
        int readInt325 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt325; i2++) {
            TLRPC$TL_attachMenuBotIcon TLdeserialize2 = TLRPC$TL_attachMenuBotIcon.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.icons.add(TLdeserialize2);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-653423106);
        int i = this.inactive ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.has_settings ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.request_write_access ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.show_in_attach_menu ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.show_in_side_menu ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.side_menu_disclaimer_needed ? i5 | 32 : i5 & (-33);
        this.flags = i6;
        abstractSerializedData.writeInt32(i6);
        abstractSerializedData.writeInt64(this.bot_id);
        abstractSerializedData.writeString(this.short_name);
        abstractSerializedData.writeInt32(481674261);
        int size = this.peer_types.size();
        abstractSerializedData.writeInt32(size);
        for (int i7 = 0; i7 < size; i7++) {
            ((TLRPC$AttachMenuPeerType) this.peer_types.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.icons.size();
        abstractSerializedData.writeInt32(size2);
        for (int i8 = 0; i8 < size2; i8++) {
            ((TLRPC$TL_attachMenuBotIcon) this.icons.get(i8)).serializeToStream(abstractSerializedData);
        }
    }
}
