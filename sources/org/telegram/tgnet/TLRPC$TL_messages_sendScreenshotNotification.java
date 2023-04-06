package org.telegram.tgnet;
public class TLRPC$TL_messages_sendScreenshotNotification extends TLObject {
    public static int constructor = -914493408;
    public TLRPC$InputPeer peer;
    public long random_id;
    public int reply_to_msg_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.reply_to_msg_id);
        abstractSerializedData.writeInt64(this.random_id);
    }
}
