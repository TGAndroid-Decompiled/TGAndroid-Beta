package org.telegram.tgnet;
public class TLRPC$TL_auth_resetLoginEmail extends TLObject {
    public static int constructor = 2123760019;
    public String phone_code_hash;
    public String phone_number;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$auth_SentCode.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.phone_number);
        abstractSerializedData.writeString(this.phone_code_hash);
    }
}
