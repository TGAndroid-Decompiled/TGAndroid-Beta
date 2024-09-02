package org.telegram.tgnet;

public class TLRPC$TL_businessAwayMessage extends TLObject {
    public int flags;
    public boolean offline_only;
    public TLRPC$TL_businessRecipients recipients;
    public TLRPC$BusinessAwayMessageSchedule schedule;
    public int shortcut_id;

    public static TLRPC$TL_businessAwayMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != -283809188) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_businessAwayMessage", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_businessAwayMessage tLRPC$TL_businessAwayMessage = new TLRPC$TL_businessAwayMessage();
        tLRPC$TL_businessAwayMessage.readParams(abstractSerializedData, z);
        return tLRPC$TL_businessAwayMessage;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.offline_only = (readInt32 & 1) != 0;
        this.shortcut_id = abstractSerializedData.readInt32(z);
        this.schedule = TLRPC$BusinessAwayMessageSchedule.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.recipients = TLRPC$TL_businessRecipients.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-283809188);
        int i = this.offline_only ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.shortcut_id);
        this.schedule.serializeToStream(abstractSerializedData);
        this.recipients.serializeToStream(abstractSerializedData);
    }
}
