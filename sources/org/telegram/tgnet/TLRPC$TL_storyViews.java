package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_storyViews extends TLObject {
    public static int constructor = -748199729;
    public int flags;
    public ArrayList<Long> recent_viewers = new ArrayList<>();
    public int views_count;

    public static TLRPC$TL_storyViews TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_storyViews", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_storyViews tLRPC$TL_storyViews = new TLRPC$TL_storyViews();
        tLRPC$TL_storyViews.readParams(abstractSerializedData, z);
        return tLRPC$TL_storyViews;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.views_count = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                this.recent_viewers.add(Long.valueOf(abstractSerializedData.readInt64(z)));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.views_count);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.recent_viewers.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                abstractSerializedData.writeInt64(this.recent_viewers.get(i).longValue());
            }
        }
    }
}
