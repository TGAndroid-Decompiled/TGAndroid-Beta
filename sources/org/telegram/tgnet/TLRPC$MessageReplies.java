package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$MessageReplies extends TLObject {
    public long channel_id;
    public boolean comments;
    public int flags;
    public int max_id;
    public int read_max_id;
    public ArrayList<TLRPC$Peer> recent_repliers = new ArrayList<>();
    public int replies;
    public int replies_pts;

    public static TLRPC$MessageReplies TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_messageReplies tLRPC$TL_messageReplies;
        if (i != -2083123262) {
            tLRPC$TL_messageReplies = i != 1093204652 ? null : new TLRPC$TL_messageReplies() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.comments = (readInt32 & 1) != 0;
                    this.replies = abstractSerializedData2.readInt32(z2);
                    this.replies_pts = abstractSerializedData2.readInt32(z2);
                    if ((this.flags & 2) != 0) {
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$Peer TLdeserialize = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.recent_repliers.add(TLdeserialize);
                        }
                    }
                    if ((this.flags & 1) != 0) {
                        this.channel_id = abstractSerializedData2.readInt32(z2);
                    }
                    if ((this.flags & 4) != 0) {
                        this.max_id = abstractSerializedData2.readInt32(z2);
                    }
                    if ((this.flags & 8) != 0) {
                        this.read_max_id = abstractSerializedData2.readInt32(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1093204652);
                    int i2 = this.comments ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    abstractSerializedData2.writeInt32(i2);
                    abstractSerializedData2.writeInt32(this.replies);
                    abstractSerializedData2.writeInt32(this.replies_pts);
                    if ((this.flags & 2) != 0) {
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.recent_repliers.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            this.recent_repliers.get(i3).serializeToStream(abstractSerializedData2);
                        }
                    }
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32((int) this.channel_id);
                    }
                    if ((this.flags & 4) != 0) {
                        abstractSerializedData2.writeInt32(this.max_id);
                    }
                    if ((this.flags & 8) != 0) {
                        abstractSerializedData2.writeInt32(this.read_max_id);
                    }
                }
            };
        } else {
            tLRPC$TL_messageReplies = new TLRPC$TL_messageReplies();
        }
        if (tLRPC$TL_messageReplies == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessageReplies", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messageReplies != null) {
            tLRPC$TL_messageReplies.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messageReplies;
    }
}
