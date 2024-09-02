package org.telegram.tgnet;

public class TLRPC$TL_account_confirmPhone extends TLObject {
    public String phone_code;
    public String phone_code_hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1596029123);
        abstractSerializedData.writeString(this.phone_code_hash);
        abstractSerializedData.writeString(this.phone_code);
    }
}
