package org.telegram.tgnet;
public class TLRPC$TL_auth_recoverPassword extends TLObject {
    public String code;
    public int flags;
    public TLRPC$TL_account_passwordInputSettings new_settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$auth_Authorization.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(923364464);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.code);
        if ((this.flags & 1) != 0) {
            this.new_settings.serializeToStream(abstractSerializedData);
        }
    }
}
