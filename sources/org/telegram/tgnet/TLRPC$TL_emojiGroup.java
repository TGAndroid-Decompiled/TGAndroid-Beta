package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_emojiGroup extends TLObject {
    public static int constructor = 2056961449;
    public ArrayList<String> emoticons = new ArrayList<>();
    public long icon_emoji_id;
    public String title;

    public static TLRPC$TL_emojiGroup TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_emojiGroup", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_emojiGroup tLRPC$TL_emojiGroup = new TLRPC$TL_emojiGroup();
        tLRPC$TL_emojiGroup.readParams(abstractSerializedData, z);
        return tLRPC$TL_emojiGroup;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.title = abstractSerializedData.readString(z);
        this.icon_emoji_id = abstractSerializedData.readInt64(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.emoticons.add(abstractSerializedData.readString(z));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeInt64(this.icon_emoji_id);
        abstractSerializedData.writeInt32(481674261);
        int size = this.emoticons.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeString(this.emoticons.get(i));
        }
    }
}
