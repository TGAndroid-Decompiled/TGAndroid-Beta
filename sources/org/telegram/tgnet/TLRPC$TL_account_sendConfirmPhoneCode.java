package org.telegram.tgnet;
public class TLRPC$TL_account_sendConfirmPhoneCode extends TLObject {
    public String hash;
    public TLRPC$TL_codeSettings settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$auth_SentCode.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(457157256);
        abstractSerializedData.writeString(this.hash);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
