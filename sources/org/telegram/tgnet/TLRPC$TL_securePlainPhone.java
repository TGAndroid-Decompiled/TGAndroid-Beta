package org.telegram.tgnet;
public class TLRPC$TL_securePlainPhone extends TLRPC$SecurePlainData {
    public static int constructor = 2103482845;
    public String phone;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.phone = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.phone);
    }
}
