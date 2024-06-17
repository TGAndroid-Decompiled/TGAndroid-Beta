package org.telegram.tgnet;

public class TLRPC$TL_contacts_search extends TLObject {
    public int limit;
    public String q;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_contacts_found.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(301470424);
        abstractSerializedData.writeString(this.q);
        abstractSerializedData.writeInt32(this.limit);
    }
}
