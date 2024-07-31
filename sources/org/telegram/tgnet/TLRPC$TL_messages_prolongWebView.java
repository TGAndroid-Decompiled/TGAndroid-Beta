package org.telegram.tgnet;
public class TLRPC$TL_messages_prolongWebView extends TLObject {
    public TLRPC$InputUser bot;
    public int flags;
    public TLRPC$InputPeer peer;
    public long query_id;
    public TLRPC$InputReplyTo reply_to;
    public TLRPC$InputPeer send_as;
    public boolean silent;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1328014717);
        int i = this.silent ? this.flags | 32 : this.flags & (-33);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        this.bot.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.query_id);
        if ((this.flags & 1) != 0) {
            this.reply_to.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8192) != 0) {
            this.send_as.serializeToStream(abstractSerializedData);
        }
    }
}
