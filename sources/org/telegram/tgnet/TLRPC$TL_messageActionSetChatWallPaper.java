package org.telegram.tgnet;
public class TLRPC$TL_messageActionSetChatWallPaper extends TLRPC$MessageAction {
    public boolean for_both;
    public boolean same;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.same = (readInt32 & 1) != 0;
        this.for_both = (readInt32 & 2) != 0;
        this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1348510708);
        int i = this.same ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.for_both ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.wallpaper.serializeToStream(abstractSerializedData);
    }
}
