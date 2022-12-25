package org.telegram.tgnet;

public class TLRPC$TL_messageReplyHeader extends TLObject {
    public static int constructor = -1495959709;
    public int flags;
    public boolean forum_topic;
    public int reply_to_msg_id;
    public TLRPC$Peer reply_to_peer_id;
    public long reply_to_random_id;
    public boolean reply_to_scheduled;
    public int reply_to_top_id;

    public static TLRPC$TL_messageReplyHeader TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messageReplyHeader", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
        tLRPC$TL_messageReplyHeader.readParams(abstractSerializedData, z);
        return tLRPC$TL_messageReplyHeader;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.reply_to_scheduled = (readInt32 & 4) != 0;
        this.forum_topic = (readInt32 & 8) != 0;
        this.reply_to_msg_id = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.reply_to_peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.reply_to_top_id = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.reply_to_scheduled ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        int i2 = this.forum_topic ? i | 8 : i & (-9);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt32(this.reply_to_msg_id);
        if ((this.flags & 1) != 0) {
            this.reply_to_peer_id.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.reply_to_top_id);
        }
    }
}
