package org.telegram.tgnet;
public class TLRPC$TL_inputBusinessAwayMessage extends TLObject {
    public int flags;
    public boolean offline_only;
    public TLRPC$TL_inputBusinessRecipients recipients;
    public TLRPC$BusinessAwayMessageSchedule schedule;
    public int shortcut_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.offline_only = (readInt32 & 1) != 0;
        this.shortcut_id = abstractSerializedData.readInt32(z);
        this.schedule = TLRPC$BusinessAwayMessageSchedule.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.recipients = TLRPC$TL_inputBusinessRecipients.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2094959136);
        int i = this.offline_only ? this.flags | 1 : this.flags & 1;
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.shortcut_id);
        this.schedule.serializeToStream(abstractSerializedData);
        this.recipients.serializeToStream(abstractSerializedData);
    }
}
