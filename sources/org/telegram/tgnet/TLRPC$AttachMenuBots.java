package org.telegram.tgnet;

public abstract class TLRPC$AttachMenuBots extends TLObject {
    public static TLRPC$AttachMenuBots TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$AttachMenuBots tLRPC$AttachMenuBots;
        if (i == -237467044) {
            tLRPC$AttachMenuBots = new TLRPC$AttachMenuBots() {
                public static int constructor = -237467044;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$AttachMenuBots = i != 1011024320 ? null : new TLRPC$TL_attachMenuBots();
        }
        if (tLRPC$AttachMenuBots == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in AttachMenuBots", Integer.valueOf(i)));
        }
        if (tLRPC$AttachMenuBots != null) {
            tLRPC$AttachMenuBots.readParams(abstractSerializedData, z);
        }
        return tLRPC$AttachMenuBots;
    }
}
