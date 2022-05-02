package org.telegram.tgnet;

public class TLRPC$TL_attachMenuBotIconColor extends TLObject {
    public static int constructor = 1165423600;
    public int color;
    public String name;

    public static TLRPC$TL_attachMenuBotIconColor TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_attachMenuBotIconColor tLRPC$TL_attachMenuBotIconColor = new TLRPC$TL_attachMenuBotIconColor();
            tLRPC$TL_attachMenuBotIconColor.readParams(abstractSerializedData, z);
            return tLRPC$TL_attachMenuBotIconColor;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_attachMenuBotIconColor", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.name = abstractSerializedData.readString(z);
        this.color = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.name);
        abstractSerializedData.writeInt32(this.color);
    }
}
