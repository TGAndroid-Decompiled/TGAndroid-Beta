package org.telegram.tgnet;

public class TLRPC$TL_contacts_addContact extends TLObject {
    public static int constructor = -386636848;
    public boolean add_phone_privacy_exception;
    public String first_name;
    public int flags;
    public TLRPC$InputUser f894id;
    public String last_name;
    public String phone;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.add_phone_privacy_exception ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.f894id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.first_name);
        abstractSerializedData.writeString(this.last_name);
        abstractSerializedData.writeString(this.phone);
    }
}
