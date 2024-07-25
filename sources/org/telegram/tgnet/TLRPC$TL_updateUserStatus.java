package org.telegram.tgnet;
public class TLRPC$TL_updateUserStatus extends TLRPC$Update {
    public TLRPC$UserStatus status;
    public long user_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-440534818);
        abstractSerializedData.writeInt64(this.user_id);
        this.status.serializeToStream(abstractSerializedData);
    }
}
