package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$InputReplyTo extends TLObject {
    public int flags;
    public TLRPC$InputPeer peer;
    public ArrayList quote_entities = new ArrayList();
    public int quote_offset;
    public String quote_text;
    public int reply_to_msg_id;
    public TLRPC$InputPeer reply_to_peer_id;
    public int story_id;
    public int top_msg_id;

    public static TLRPC$InputReplyTo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputReplyTo tLRPC$TL_inputReplyToStory = i != 121554949 ? i != 583071445 ? i != 1484862010 ? null : new TLRPC$TL_inputReplyToStory() : new TLRPC$TL_inputReplyToMessage() : new TLRPC$TL_inputReplyToMessage() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.flags = abstractSerializedData2.readInt32(z2);
                this.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                if ((this.flags & 1) != 0) {
                    this.top_msg_id = abstractSerializedData2.readInt32(z2);
                }
                if ((this.flags & 2) != 0) {
                    this.reply_to_peer_id = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }
                if ((this.flags & 4) != 0) {
                    this.quote_text = abstractSerializedData2.readString(z2);
                }
                if ((this.flags & 8) != 0) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.quote_entities.add(TLdeserialize);
                    }
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(121554949);
                abstractSerializedData2.writeInt32(this.flags);
                abstractSerializedData2.writeInt32(this.reply_to_msg_id);
                if ((this.flags & 1) != 0) {
                    abstractSerializedData2.writeInt32(this.top_msg_id);
                }
                if ((this.flags & 2) != 0) {
                    this.reply_to_peer_id.serializeToStream(abstractSerializedData2);
                }
                if ((this.flags & 4) != 0) {
                    abstractSerializedData2.writeString(this.quote_text);
                }
                if ((this.flags & 8) != 0) {
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.quote_entities.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        ((TLRPC$MessageEntity) this.quote_entities.get(i2)).serializeToStream(abstractSerializedData2);
                    }
                }
            }
        };
        if (tLRPC$TL_inputReplyToStory == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputReplyTo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputReplyToStory != null) {
            tLRPC$TL_inputReplyToStory.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputReplyToStory;
    }
}
