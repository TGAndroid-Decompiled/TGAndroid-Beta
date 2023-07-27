package org.telegram.tgnet;
public class TLRPC$TL_inputReplyToMessage extends TLRPC$InputReplyTo {
    public static int constructor = -1672247580;
    public int flags;
    public int reply_to_msg_id;
    public int top_msg_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.reply_to_msg_id = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.top_msg_id = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.reply_to_msg_id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
        }
    }
}
