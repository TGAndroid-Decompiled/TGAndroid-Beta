package org.telegram.tgnet;

public class TLRPC$TL_updateUserPhone extends TLRPC$Update {
    public String phone;
    public long user_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.phone = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(88680979);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeString(this.phone);
    }
}
