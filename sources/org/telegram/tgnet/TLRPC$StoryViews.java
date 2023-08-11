package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$StoryViews extends TLObject {
    public int flags;
    public int reactions_count;
    public ArrayList<Long> recent_viewers = new ArrayList<>();
    public int views_count;

    public static TLRPC$StoryViews TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$StoryViews tLRPC$TL_storyViews = i != -968094825 ? i != -748199729 ? null : new TLRPC$StoryViews() {
            public static int constructor = -748199729;

            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.flags = abstractSerializedData2.readInt32(z2);
                this.views_count = abstractSerializedData2.readInt32(z2);
                if ((this.flags & 1) != 0) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        this.recent_viewers.add(Long.valueOf(abstractSerializedData2.readInt64(z2)));
                    }
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(constructor);
                abstractSerializedData2.writeInt32(this.flags);
                abstractSerializedData2.writeInt32(this.views_count);
                if ((this.flags & 1) != 0) {
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.recent_viewers.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        abstractSerializedData2.writeInt64(this.recent_viewers.get(i2).longValue());
                    }
                }
            }
        } : new TLRPC$TL_storyViews();
        if (tLRPC$TL_storyViews == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StoryViews", Integer.valueOf(i)));
        }
        if (tLRPC$TL_storyViews != null) {
            tLRPC$TL_storyViews.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_storyViews;
    }
}
