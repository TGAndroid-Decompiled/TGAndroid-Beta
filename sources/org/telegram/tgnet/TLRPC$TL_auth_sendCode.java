package org.telegram.tgnet;

public class TLRPC$TL_auth_sendCode extends TLObject {
    public String api_hash;
    public int api_id;
    public String phone_number;
    public TLRPC$TL_codeSettings settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$auth_SentCode.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1502141361);
        abstractSerializedData.writeString(this.phone_number);
        abstractSerializedData.writeInt32(this.api_id);
        abstractSerializedData.writeString(this.api_hash);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
