package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Peer;

public abstract class TL_stories$StoryFwdHeader extends TLObject {
    public int flags;
    public TLRPC$Peer from;
    public String from_name;
    public boolean modified;
    public int story_id;

    public static TL_stories$StoryFwdHeader TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$StoryFwdHeader tL_stories$StoryFwdHeader = i != -1205411504 ? null : new TL_stories$StoryFwdHeader() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.modified = (readInt32 & 8) != 0;
                if ((readInt32 & 1) != 0) {
                    this.from = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }
                if ((this.flags & 2) != 0) {
                    this.from_name = abstractSerializedData2.readString(z2);
                }
                if ((this.flags & 4) != 0) {
                    this.story_id = abstractSerializedData2.readInt32(z2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1205411504);
                int i2 = this.modified ? this.flags | 8 : this.flags & (-9);
                this.flags = i2;
                abstractSerializedData2.writeInt32(i2);
                if ((this.flags & 1) != 0) {
                    this.from.serializeToStream(abstractSerializedData2);
                }
                if ((this.flags & 2) != 0) {
                    abstractSerializedData2.writeString(this.from_name);
                }
                if ((this.flags & 4) != 0) {
                    abstractSerializedData2.writeInt32(this.story_id);
                }
            }
        };
        if (tL_stories$StoryFwdHeader == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StoryFwdHeader", Integer.valueOf(i)));
        }
        if (tL_stories$StoryFwdHeader != null) {
            tL_stories$StoryFwdHeader.readParams(abstractSerializedData, z);
        }
        return tL_stories$StoryFwdHeader;
    }
}
