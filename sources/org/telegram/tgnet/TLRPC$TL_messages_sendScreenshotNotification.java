package org.telegram.tgnet;

public class TLRPC$TL_messages_sendScreenshotNotification extends TLObject {
    public TLRPC$InputPeer peer;
    public long random_id;
    public TLRPC$InputReplyTo reply_to;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1589618665);
        this.peer.serializeToStream(abstractSerializedData);
        this.reply_to.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.random_id);
    }
}
