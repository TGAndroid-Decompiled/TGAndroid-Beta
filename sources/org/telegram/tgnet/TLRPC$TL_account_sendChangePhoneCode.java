package org.telegram.tgnet;
public class TLRPC$TL_account_sendChangePhoneCode extends TLObject {
    public static int constructor = -2108208411;
    public String phone_number;
    public TLRPC$TL_codeSettings settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$auth_SentCode.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.phone_number);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
