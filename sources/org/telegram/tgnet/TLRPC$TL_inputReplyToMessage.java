package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_inputReplyToMessage extends TLRPC$InputReplyTo {
    public int flags;
    public ArrayList<TLRPC$MessageEntity> quote_entities = new ArrayList<>();
    public String quote_text;
    public int reply_to_msg_id;
    public TLRPC$InputPeer reply_to_peer_id;
    public int top_msg_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.reply_to_msg_id = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.top_msg_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.reply_to_peer_id = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.quote_text = abstractSerializedData.readString(z);
        }
        if ((this.flags & 8) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.quote_entities.add(TLdeserialize);
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(121554949);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.reply_to_msg_id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
        }
        if ((this.flags & 2) != 0) {
            this.reply_to_peer_id.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.quote_text);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.quote_entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.quote_entities.get(i).serializeToStream(abstractSerializedData);
            }
        }
    }
}
