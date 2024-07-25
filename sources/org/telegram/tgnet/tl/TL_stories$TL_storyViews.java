package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$ReactionCount;
public class TL_stories$TL_storyViews extends TL_stories$StoryViews {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.has_viewers = (readInt32 & 2) != 0;
        this.views_count = abstractSerializedData.readInt32(z);
        if ((this.flags & 4) != 0) {
            this.forwards_count = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$ReactionCount TLdeserialize = TLRPC$ReactionCount.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.reactions.add(TLdeserialize);
            }
        }
        if ((this.flags & 16) != 0) {
            this.reactions_count = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                }
                return;
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt325; i2++) {
                this.recent_viewers.add(Long.valueOf(abstractSerializedData.readInt64(z)));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1923523370);
        int i = this.has_viewers ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.views_count);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.forwards_count);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.reactions.size();
            abstractSerializedData.writeInt32(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.reactions.get(i2).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.reactions_count);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.recent_viewers.size();
            abstractSerializedData.writeInt32(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                abstractSerializedData.writeInt64(this.recent_viewers.get(i3).longValue());
            }
        }
    }
}
