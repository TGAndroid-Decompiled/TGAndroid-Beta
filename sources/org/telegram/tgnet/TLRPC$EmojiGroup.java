package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$EmojiGroup extends TLObject {
    public ArrayList emoticons = new ArrayList();
    public long icon_emoji_id;
    public String title;

    public static TLRPC$EmojiGroup TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EmojiGroup tLRPC$EmojiGroup = i != -2133693241 ? i != 154914612 ? i != 2056961449 ? null : new TLRPC$EmojiGroup() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.title = abstractSerializedData2.readString(z2);
                this.icon_emoji_id = abstractSerializedData2.readInt64(z2);
                int readInt32 = abstractSerializedData2.readInt32(z2);
                if (readInt32 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                    }
                } else {
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        this.emoticons.add(abstractSerializedData2.readString(z2));
                    }
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(2056961449);
                abstractSerializedData2.writeString(this.title);
                abstractSerializedData2.writeInt64(this.icon_emoji_id);
                abstractSerializedData2.writeInt32(481674261);
                int size = this.emoticons.size();
                abstractSerializedData2.writeInt32(size);
                for (int i2 = 0; i2 < size; i2++) {
                    abstractSerializedData2.writeString((String) this.emoticons.get(i2));
                }
            }
        } : new TLRPC$EmojiGroup() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.title = abstractSerializedData2.readString(z2);
                this.icon_emoji_id = abstractSerializedData2.readInt64(z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(154914612);
                abstractSerializedData2.writeString(this.title);
                abstractSerializedData2.writeInt64(this.icon_emoji_id);
            }
        } : new TLRPC$EmojiGroup() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.title = abstractSerializedData2.readString(z2);
                this.icon_emoji_id = abstractSerializedData2.readInt64(z2);
                int readInt32 = abstractSerializedData2.readInt32(z2);
                if (readInt32 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                    }
                } else {
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        this.emoticons.add(abstractSerializedData2.readString(z2));
                    }
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-2133693241);
                abstractSerializedData2.writeString(this.title);
                abstractSerializedData2.writeInt64(this.icon_emoji_id);
                abstractSerializedData2.writeInt32(481674261);
                int size = this.emoticons.size();
                abstractSerializedData2.writeInt32(size);
                for (int i2 = 0; i2 < size; i2++) {
                    abstractSerializedData2.writeString((String) this.emoticons.get(i2));
                }
            }
        };
        if (tLRPC$EmojiGroup == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in EmojiGroup", Integer.valueOf(i)));
        }
        if (tLRPC$EmojiGroup != null) {
            tLRPC$EmojiGroup.readParams(abstractSerializedData, z);
        }
        return tLRPC$EmojiGroup;
    }
}
