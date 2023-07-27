package org.telegram.tgnet;
public abstract class TLRPC$AttachMenuBots extends TLObject {
    public static TLRPC$AttachMenuBots TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$AttachMenuBots tLRPC$TL_attachMenuBots = i != -237467044 ? i != 1011024320 ? null : new TLRPC$TL_attachMenuBots() : new TLRPC$AttachMenuBots() {
            public static int constructor = -237467044;

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(constructor);
            }
        };
        if (tLRPC$TL_attachMenuBots == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in AttachMenuBots", Integer.valueOf(i)));
        }
        if (tLRPC$TL_attachMenuBots != null) {
            tLRPC$TL_attachMenuBots.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_attachMenuBots;
    }
}
