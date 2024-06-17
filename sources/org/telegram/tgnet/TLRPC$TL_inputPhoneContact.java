package org.telegram.tgnet;

public class TLRPC$TL_inputPhoneContact extends TLObject {
    public long client_id;
    public String first_name;
    public String last_name;
    public String phone;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.client_id = abstractSerializedData.readInt64(z);
        this.phone = abstractSerializedData.readString(z);
        this.first_name = abstractSerializedData.readString(z);
        this.last_name = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-208488460);
        abstractSerializedData.writeInt64(this.client_id);
        abstractSerializedData.writeString(this.phone);
        abstractSerializedData.writeString(this.first_name);
        abstractSerializedData.writeString(this.last_name);
    }
}
