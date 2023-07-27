package org.telegram.tgnet;
public abstract class TLRPC$MessageReplyHeader extends TLObject {
    public int flags;
    public boolean forum_topic;
    public int reply_to_msg_id;
    public TLRPC$Peer reply_to_peer_id;
    public long reply_to_random_id;
    public boolean reply_to_scheduled;
    public int reply_to_top_id;
    public int story_id;
    public long user_id;

    public static TLRPC$MessageReplyHeader TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MessageReplyHeader tLRPC$TL_messageReplyStoryHeader;
        if (i == -1667711039) {
            tLRPC$TL_messageReplyStoryHeader = new TLRPC$TL_messageReplyStoryHeader();
        } else {
            tLRPC$TL_messageReplyStoryHeader = i != -1495959709 ? null : new TLRPC$TL_messageReplyHeader();
        }
        if (tLRPC$TL_messageReplyStoryHeader == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessageReplyHeader", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messageReplyStoryHeader != null) {
            tLRPC$TL_messageReplyStoryHeader.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messageReplyStoryHeader;
    }
}
