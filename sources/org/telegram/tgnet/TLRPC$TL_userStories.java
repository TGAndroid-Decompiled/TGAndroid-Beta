package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_userStories extends TLObject {
    public static int constructor = -2045664768;
    public int flags;
    public int max_read_id;
    public ArrayList<TLRPC$StoryItem> stories = new ArrayList<>();
    public long user_id;

    public static TLRPC$TL_userStories TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_userStories", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_userStories tLRPC$TL_userStories = new TLRPC$TL_userStories();
        tLRPC$TL_userStories.readParams(abstractSerializedData, z);
        return tLRPC$TL_userStories;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.user_id = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.max_read_id = abstractSerializedData.readInt32(z);
        }
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$StoryItem TLdeserialize = TLRPC$StoryItem.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.stories.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.user_id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.max_read_id);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.stories.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.stories.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
