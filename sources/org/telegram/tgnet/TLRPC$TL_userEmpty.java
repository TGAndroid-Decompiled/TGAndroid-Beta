package org.telegram.tgnet;
public class TLRPC$TL_userEmpty extends TLRPC$User {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-742634630);
        abstractSerializedData.writeInt64(this.id);
    }
}
