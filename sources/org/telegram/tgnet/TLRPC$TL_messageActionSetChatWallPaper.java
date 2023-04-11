package org.telegram.tgnet;
public class TLRPC$TL_messageActionSetChatWallPaper extends TLRPC$MessageAction {
    public static int constructor = -1136350937;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.wallpaper.serializeToStream(abstractSerializedData);
    }
}
