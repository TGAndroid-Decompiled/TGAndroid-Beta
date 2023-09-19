package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$PeerStories extends TLObject {
    public int flags;
    public int max_read_id;
    public TLRPC$Peer peer;
    public ArrayList<TLRPC$StoryItem> stories = new ArrayList<>();

    public static TLRPC$PeerStories TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_peerStories tLRPC$TL_peerStories = i != -2045664768 ? i != -1707742823 ? null : new TLRPC$TL_peerStories() : new TLRPC$TL_peerStories() {
            public static int constructor = -2045664768;

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
                    TLRPC$StoryItem TLdeserialize = TLRPC$StoryItem.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize == null) {
                        return;
                    }
                    this.stories.add(TLdeserialize);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(constructor);
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
        if (tLRPC$TL_peerStories == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PeerStories", Integer.valueOf(i)));
        }
        if (tLRPC$TL_peerStories != null) {
            tLRPC$TL_peerStories.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_peerStories;
    }
}
