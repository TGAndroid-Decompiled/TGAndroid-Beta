package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;
public class TLRPC$TL_storyItemSkipped extends TLRPC$StoryItem {
    public static int constructor = -5388013;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.close_friends = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
        this.id = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
        this.expire_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.close_friends ? this.flags | LiteMode.FLAG_CHAT_BLUR : this.flags & (-257);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.id);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.expire_date);
    }
}
