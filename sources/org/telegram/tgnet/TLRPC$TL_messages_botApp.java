package org.telegram.tgnet;

public class TLRPC$TL_messages_botApp extends TLObject {
    public TLRPC$BotApp app;
    public int flags;
    public boolean inactive;
    public boolean request_write_access;

    public static TLRPC$TL_messages_botApp TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-347034123 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_botApp", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_botApp tLRPC$TL_messages_botApp = new TLRPC$TL_messages_botApp();
        tLRPC$TL_messages_botApp.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_botApp;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.inactive = (readInt32 & 1) != 0;
        this.request_write_access = (readInt32 & 2) != 0;
        this.app = TLRPC$BotApp.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-347034123);
        int i = this.inactive ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.request_write_access ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.app.serializeToStream(abstractSerializedData);
    }
}
