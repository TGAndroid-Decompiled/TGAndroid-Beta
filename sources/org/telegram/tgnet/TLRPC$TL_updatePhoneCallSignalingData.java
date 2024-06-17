package org.telegram.tgnet;

public class TLRPC$TL_updatePhoneCallSignalingData extends TLRPC$Update {
    public byte[] data;
    public long phone_call_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.phone_call_id = abstractSerializedData.readInt64(z);
        this.data = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(643940105);
        abstractSerializedData.writeInt64(this.phone_call_id);
        abstractSerializedData.writeByteArray(this.data);
    }
}
