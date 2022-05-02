package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_attachMenuBot extends TLRPC$AttachMenuBot {
    public static int constructor = -928371502;
    public long bot_id;
    public int flags;
    public boolean inactive;
    public String short_name;
    public ArrayList<TLRPC$AttachMenuPeerType> peer_types = new ArrayList<>();
    public ArrayList<TLRPC$TL_attachMenuBotIcon> icons = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.inactive = (readInt32 & 1) != 0;
        this.bot_id = abstractSerializedData.readInt64(z);
        this.short_name = abstractSerializedData.readString(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 == 481674261) {
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$AttachMenuPeerType TLdeserialize = TLRPC$AttachMenuPeerType.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize != null) {
                    this.peer_types.add(TLdeserialize);
                } else {
                    return;
                }
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 == 481674261) {
                int readInt325 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt325; i2++) {
                    TLRPC$TL_attachMenuBotIcon TLdeserialize2 = TLRPC$TL_attachMenuBotIcon.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize2 != null) {
                        this.icons.add(TLdeserialize2);
                    } else {
                        return;
                    }
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
            }
        } else if (z) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.inactive ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.bot_id);
        abstractSerializedData.writeString(this.short_name);
        abstractSerializedData.writeInt32(481674261);
        int size = this.peer_types.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.peer_types.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.icons.size();
        abstractSerializedData.writeInt32(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            this.icons.get(i3).serializeToStream(abstractSerializedData);
        }
    }
}
