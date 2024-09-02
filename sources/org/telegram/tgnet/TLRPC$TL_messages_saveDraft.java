package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_saveDraft extends TLObject {
    public long effect;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public boolean invert_media;
    public TLRPC$InputMedia media;
    public String message;
    public boolean no_webpage;
    public TLRPC$InputPeer peer;
    public TLRPC$InputReplyTo reply_to;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-747452978);
        int i = this.no_webpage ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.invert_media ? i | 64 : i & (-65);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        if ((this.flags & 16) != 0) {
            this.reply_to.serializeToStream(abstractSerializedData);
        }
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.message);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i3 = 0; i3 < size; i3++) {
                this.entities.get(i3).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 32) != 0) {
            this.media.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeInt64(this.effect);
        }
    }
}
