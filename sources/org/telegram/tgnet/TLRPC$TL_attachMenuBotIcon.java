package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_attachMenuBotIcon extends TLObject {
    public static int constructor = -1297663893;
    public ArrayList<TLRPC$TL_attachMenuBotIconColor> colors = new ArrayList<>();
    public int flags;
    public TLRPC$Document icon;
    public String name;

    public static TLRPC$TL_attachMenuBotIcon TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_attachMenuBotIcon", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_attachMenuBotIcon tLRPC$TL_attachMenuBotIcon = new TLRPC$TL_attachMenuBotIcon();
        tLRPC$TL_attachMenuBotIcon.readParams(abstractSerializedData, z);
        return tLRPC$TL_attachMenuBotIcon;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.name = abstractSerializedData.readString(z);
        this.icon = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC$TL_attachMenuBotIconColor TLdeserialize = TLRPC$TL_attachMenuBotIconColor.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.colors.add(TLdeserialize);
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.name);
        this.icon.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.colors.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.colors.get(i).serializeToStream(abstractSerializedData);
            }
        }
    }
}
