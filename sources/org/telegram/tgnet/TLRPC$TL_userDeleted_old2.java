package org.telegram.tgnet;

public class TLRPC$TL_userDeleted_old2 extends TLRPC$User {
    public static int constructor = -704549510;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f985id = abstractSerializedData.readInt32(z);
        this.first_name = abstractSerializedData.readString(z);
        this.last_name = abstractSerializedData.readString(z);
        this.username = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32((int) this.f985id);
        abstractSerializedData.writeString(this.first_name);
        abstractSerializedData.writeString(this.last_name);
        abstractSerializedData.writeString(this.username);
    }
}
