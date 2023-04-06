package org.telegram.tgnet;
public class TLRPC$TL_replyKeyboardHide extends TLRPC$ReplyMarkup {
    public static int constructor = -1606526075;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.selective = (readInt32 & 4) != 0;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.selective ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
    }
}
