package org.telegram.tgnet;

public class TLRPC$TL_businessGreetingMessage extends TLObject {
    public int no_activity_days;
    public TLRPC$TL_businessRecipients recipients;
    public int shortcut_id;

    public static TLRPC$TL_businessGreetingMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != -451302485) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_businessGreetingMessage", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_businessGreetingMessage tLRPC$TL_businessGreetingMessage = new TLRPC$TL_businessGreetingMessage();
        tLRPC$TL_businessGreetingMessage.readParams(abstractSerializedData, z);
        return tLRPC$TL_businessGreetingMessage;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.shortcut_id = abstractSerializedData.readInt32(z);
        this.recipients = TLRPC$TL_businessRecipients.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.no_activity_days = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-451302485);
        abstractSerializedData.writeInt32(this.shortcut_id);
        this.recipients.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.no_activity_days);
    }
}
