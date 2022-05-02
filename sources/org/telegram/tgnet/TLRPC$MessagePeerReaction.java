package org.telegram.tgnet;

public abstract class TLRPC$MessagePeerReaction extends TLObject {
    public boolean big;
    public int flags;
    public TLRPC$Peer peer_id;
    public String reaction;
    public boolean unread;

    public static TLRPC$TL_messagePeerReaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_messagePeerReaction tLRPC$TL_messagePeerReaction;
        if (i != -1826077446) {
            tLRPC$TL_messagePeerReaction = i != 1370914559 ? null : new TLRPC$TL_messagePeerReaction();
        } else {
            tLRPC$TL_messagePeerReaction = new TLRPC$TL_messagePeerReaction() {
                public static int constructor = -1826077446;
                public long user_id;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.user_id = abstractSerializedData2.readInt64(z2);
                    this.reaction = abstractSerializedData2.readString(z2);
                    TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                    this.peer_id = tLRPC$TL_peerUser;
                    tLRPC$TL_peerUser.user_id = this.user_id;
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt64(this.user_id);
                    abstractSerializedData2.writeString(this.reaction);
                }
            };
        }
        if (tLRPC$TL_messagePeerReaction != null || !z) {
            if (tLRPC$TL_messagePeerReaction != null) {
                tLRPC$TL_messagePeerReaction.readParams(abstractSerializedData, z);
            }
            return tLRPC$TL_messagePeerReaction;
        }
        throw new RuntimeException(String.format("can't parse magic %x in MessagePeerReaction", Integer.valueOf(i)));
    }
}
