package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Reaction;

public class TL_stories$StoryView extends TLObject {
    public boolean blocked;
    public boolean blocked_my_stories_from;
    public int date;
    public int flags;
    public TLRPC$Message message;
    public TLRPC$Peer peer_id;
    public TLRPC$Reaction reaction;
    public TL_stories$StoryItem story;
    public long user_id;

    public static TL_stories$StoryView TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$StoryView tL_stories$StoryView;
        if (i == -1870436597) {
            tL_stories$StoryView = new TL_stories$StoryView() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.blocked = (readInt32 & 1) != 0;
                    this.blocked_my_stories_from = (readInt32 & 2) != 0;
                    this.message = TLRPC$Message.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1870436597);
                    int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    int i3 = this.blocked_my_stories_from ? i2 | 2 : i2 & (-3);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    this.message.serializeToStream(abstractSerializedData2);
                }
            };
        } else if (i == -1329730875) {
            tL_stories$StoryView = new TL_stories$TL_storyView();
        } else {
            tL_stories$StoryView = i != -1116418231 ? null : new TL_stories$StoryView() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.blocked = (readInt32 & 1) != 0;
                    this.blocked_my_stories_from = (readInt32 & 2) != 0;
                    this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.story = TL_stories$StoryItem.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1116418231);
                    int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    int i3 = this.blocked_my_stories_from ? i2 | 2 : i2 & (-3);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    this.peer_id.serializeToStream(abstractSerializedData2);
                    this.story.serializeToStream(abstractSerializedData2);
                }
            };
        }
        if (tL_stories$StoryView == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StoryView", Integer.valueOf(i)));
        }
        if (tL_stories$StoryView != null) {
            tL_stories$StoryView.readParams(abstractSerializedData, z);
        }
        return tL_stories$StoryView;
    }
}
