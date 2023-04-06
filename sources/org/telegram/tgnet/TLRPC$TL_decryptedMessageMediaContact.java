package org.telegram.tgnet;
public class TLRPC$TL_decryptedMessageMediaContact extends TLRPC$DecryptedMessageMedia {
    public static int constructor = 1485441687;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.phone_number = abstractSerializedData.readString(z);
        this.first_name = abstractSerializedData.readString(z);
        this.last_name = abstractSerializedData.readString(z);
        this.user_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.phone_number);
        abstractSerializedData.writeString(this.first_name);
        abstractSerializedData.writeString(this.last_name);
        abstractSerializedData.writeInt32((int) this.user_id);
    }
}
