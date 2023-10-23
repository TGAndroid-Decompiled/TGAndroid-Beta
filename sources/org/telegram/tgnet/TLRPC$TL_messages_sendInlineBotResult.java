package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;
public class TLRPC$TL_messages_sendInlineBotResult extends TLObject {
    public boolean background;
    public boolean clear_draft;
    public int flags;
    public boolean hide_via;
    public String id;
    public TLRPC$InputPeer peer;
    public long query_id;
    public long random_id;
    public TLRPC$InputReplyTo reply_to;
    public int schedule_date;
    public TLRPC$InputPeer send_as;
    public boolean silent;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-138647366);
        int i = this.silent ? this.flags | 32 : this.flags & (-33);
        this.flags = i;
        int i2 = this.background ? i | 64 : i & (-65);
        this.flags = i2;
        int i3 = this.clear_draft ? i2 | 128 : i2 & (-129);
        this.flags = i3;
        int i4 = this.hide_via ? i3 | LiteMode.FLAG_AUTOPLAY_GIFS : i3 & (-2049);
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            this.reply_to.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt64(this.random_id);
        abstractSerializedData.writeInt64(this.query_id);
        abstractSerializedData.writeString(this.id);
        if ((this.flags & 1024) != 0) {
            abstractSerializedData.writeInt32(this.schedule_date);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
            this.send_as.serializeToStream(abstractSerializedData);
        }
    }
}
