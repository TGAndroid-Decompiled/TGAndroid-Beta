package org.telegram.tgnet;

public class TLRPC$TL_userEmpty extends TLRPC$User {
    public static int constructor = -742634630;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f995id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f995id);
    }
}
