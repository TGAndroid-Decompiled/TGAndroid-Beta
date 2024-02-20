package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_peerUser;
public abstract class TL_stories$PeerStories extends TLObject {
    public int flags;
    public int max_read_id;
    public TLRPC$Peer peer;
    public ArrayList<TL_stories$StoryItem> stories = new ArrayList<>();

    public static TL_stories$PeerStories TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$TL_peerStories tL_stories$TL_peerStories;
        if (i != -2045664768) {
            tL_stories$TL_peerStories = i != -1707742823 ? null : new TL_stories$TL_peerStories();
        } else {
            tL_stories$TL_peerStories = new TL_stories$TL_peerStories() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    long readInt64 = abstractSerializedData2.readInt64(z2);
                    TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                    this.peer = tLRPC$TL_peerUser;
                    tLRPC$TL_peerUser.user_id = readInt64;
                    if ((this.flags & 1) != 0) {
                        this.max_read_id = abstractSerializedData2.readInt32(z2);
                    }
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TL_stories$StoryItem TLdeserialize = TL_stories$StoryItem.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.stories.add(TLdeserialize);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-2045664768);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeInt64(this.peer.user_id);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32(this.max_read_id);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.stories.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.stories.get(i2).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tL_stories$TL_peerStories == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PeerStories", Integer.valueOf(i)));
        }
        if (tL_stories$TL_peerStories != null) {
            tL_stories$TL_peerStories.readParams(abstractSerializedData, z);
        }
        return tL_stories$TL_peerStories;
    }
}
