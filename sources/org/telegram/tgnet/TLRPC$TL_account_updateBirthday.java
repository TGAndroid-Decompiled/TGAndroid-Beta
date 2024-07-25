package org.telegram.tgnet;
public class TLRPC$TL_account_updateBirthday extends TLObject {
    public TLRPC$TL_birthday birthday;
    public int flags;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-865203183);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            this.birthday.serializeToStream(abstractSerializedData);
        }
    }
}
