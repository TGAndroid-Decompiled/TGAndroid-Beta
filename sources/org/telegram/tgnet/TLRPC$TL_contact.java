package org.telegram.tgnet;
public class TLRPC$TL_contact extends TLObject {
    public boolean mutual;
    public long user_id;

    public static TLRPC$TL_contact TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (341499403 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_contact", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
        tLRPC$TL_contact.readParams(abstractSerializedData, z);
        return tLRPC$TL_contact;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.mutual = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(341499403);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeBool(this.mutual);
    }
}
