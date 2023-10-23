package org.telegram.tgnet;
public class TLRPC$TL_updateNewScheduledMessage extends TLRPC$Update {
    public TLRPC$Message message;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.message = TLRPC$Message.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(967122427);
        this.message.serializeToStream(abstractSerializedData);
    }
}
