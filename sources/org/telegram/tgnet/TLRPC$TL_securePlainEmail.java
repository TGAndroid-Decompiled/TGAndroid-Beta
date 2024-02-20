package org.telegram.tgnet;
public class TLRPC$TL_securePlainEmail extends TLRPC$SecurePlainData {
    public String email;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.email = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(569137759);
        abstractSerializedData.writeString(this.email);
    }
}
