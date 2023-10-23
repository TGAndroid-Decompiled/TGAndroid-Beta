package org.telegram.tgnet;
public class TLRPC$TL_messageActionSetChatWallPaper extends TLRPC$MessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1136350937);
        this.wallpaper.serializeToStream(abstractSerializedData);
    }
}
