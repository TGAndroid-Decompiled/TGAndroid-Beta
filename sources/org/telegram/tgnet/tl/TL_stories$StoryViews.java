package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ReactionCount;
public abstract class TL_stories$StoryViews extends TLObject {
    public int flags;
    public int forwards_count;
    public boolean has_viewers;
    public int reactions_count;
    public int views_count;
    public ArrayList<Long> recent_viewers = new ArrayList<>();
    public ArrayList<TLRPC$ReactionCount> reactions = new ArrayList<>();

    public static TL_stories$StoryViews TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$StoryViews tL_stories$TL_storyViews;
        if (i == -1923523370) {
            tL_stories$TL_storyViews = new TL_stories$TL_storyViews();
        } else if (i != -968094825) {
            tL_stories$TL_storyViews = i != -748199729 ? null : new TL_stories$StoryViews() {
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
                    abstractSerializedData2.writeInt32(-748199729);
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
            };
        } else {
            tL_stories$TL_storyViews = new TL_stories$StoryViews() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.views_count = abstractSerializedData2.readInt32(z2);
                    this.reactions_count = abstractSerializedData2.readInt32(z2);
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
                    abstractSerializedData2.writeInt32(-968094825);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeInt32(this.views_count);
                    abstractSerializedData2.writeInt32(this.reactions_count);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.recent_viewers.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            abstractSerializedData2.writeInt64(this.recent_viewers.get(i2).longValue());
                        }
                    }
                }
            };
        }
        if (tL_stories$TL_storyViews == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StoryViews", Integer.valueOf(i)));
        }
        if (tL_stories$TL_storyViews != null) {
            tL_stories$TL_storyViews.readParams(abstractSerializedData, z);
        }
        return tL_stories$TL_storyViews;
    }
}
