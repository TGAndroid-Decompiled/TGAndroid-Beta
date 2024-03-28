package org.telegram.tgnet;
public class TLRPC$TL_connectedBot extends TLObject {
    public static int constructor = -1123645951;
    public long bot_id;
    public boolean can_reply;
    public int flags;
    public TLRPC$TL_businessBotRecipients recipients;

    public static TLRPC$TL_connectedBot TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != constructor) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_connectedBot", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_connectedBot tLRPC$TL_connectedBot = new TLRPC$TL_connectedBot();
        tLRPC$TL_connectedBot.readParams(abstractSerializedData, z);
        return tLRPC$TL_connectedBot;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.can_reply = (readInt32 & 1) != 0;
        this.bot_id = abstractSerializedData.readInt64(z);
        this.recipients = TLRPC$TL_businessBotRecipients.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.can_reply ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.bot_id);
        this.recipients.serializeToStream(abstractSerializedData);
    }
}
