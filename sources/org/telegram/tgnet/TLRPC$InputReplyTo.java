package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$InputReplyTo extends TLObject {
    public int flags;
    public ArrayList<TLRPC$MessageEntity> quote_entities = new ArrayList<>();
    public String quote_text;
    public int reply_to_msg_id;
    public TLRPC$InputPeer reply_to_peer_id;
    public int story_id;
    public int top_msg_id;
    public TLRPC$InputUser user_id;

    public static TLRPC$InputReplyTo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputReplyTo tLRPC$TL_inputReplyToStory = i != 121554949 ? i != 363917955 ? null : new TLRPC$TL_inputReplyToStory() : new TLRPC$TL_inputReplyToMessage();
        if (tLRPC$TL_inputReplyToStory == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputReplyTo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputReplyToStory != null) {
            tLRPC$TL_inputReplyToStory.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputReplyToStory;
    }
}
