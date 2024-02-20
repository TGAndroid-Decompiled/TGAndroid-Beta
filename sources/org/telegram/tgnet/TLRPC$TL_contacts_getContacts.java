package org.telegram.tgnet;
public class TLRPC$TL_contacts_getContacts extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$contacts_Contacts.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1574346258);
        abstractSerializedData.writeInt64(this.hash);
    }
}
