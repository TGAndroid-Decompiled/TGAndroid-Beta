package org.telegram.tgnet;

public class TLRPC$TL_inputBusinessGreetingMessage extends TLObject {
    public int no_activity_days;
    public TLRPC$TL_inputBusinessRecipients recipients;
    public int shortcut_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.shortcut_id = abstractSerializedData.readInt32(z);
        this.recipients = TLRPC$TL_inputBusinessRecipients.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.no_activity_days = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(26528571);
        abstractSerializedData.writeInt32(this.shortcut_id);
        this.recipients.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.no_activity_days);
    }
}
