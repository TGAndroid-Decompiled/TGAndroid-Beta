package org.telegram.tgnet;
public class TLRPC$TL_messageReplyHeader extends TLRPC$MessageReplyHeader {
    public static int constructor = -1495959709;

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
