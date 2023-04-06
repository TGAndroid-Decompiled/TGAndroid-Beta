package org.telegram.tgnet;
public class TLRPC$TL_messageActionBotAllowed extends TLRPC$MessageAction {
    public static int constructor = -988359047;
    public TLRPC$BotApp app;
    public boolean attach_menu;
    public String domain;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.attach_menu = (readInt32 & 2) != 0;
        if ((readInt32 & 1) != 0) {
            this.domain = abstractSerializedData.readString(z);
        }
        if ((this.flags & 4) != 0) {
            this.app = TLRPC$BotApp.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.attach_menu ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.domain);
        }
        if ((this.flags & 4) != 0) {
            this.app.serializeToStream(abstractSerializedData);
        }
    }
}
