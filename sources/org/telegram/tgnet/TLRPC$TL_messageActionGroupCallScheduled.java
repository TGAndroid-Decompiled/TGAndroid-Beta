package org.telegram.tgnet;
public class TLRPC$TL_messageActionGroupCallScheduled extends TLRPC$MessageAction {
    public int schedule_date;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.schedule_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1281329567);
        this.call.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.schedule_date);
    }
}
