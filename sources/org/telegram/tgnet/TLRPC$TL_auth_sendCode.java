package org.telegram.tgnet;

public class TLRPC$TL_auth_sendCode extends TLObject {
    public static int constructor = -1502141361;
    public String api_hash;
    public int api_id;
    public String phone_number;
    public TLRPC$TL_codeSettings settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_auth_sentCode.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.phone_number);
        abstractSerializedData.writeInt32(this.api_id);
        abstractSerializedData.writeString(this.api_hash);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
