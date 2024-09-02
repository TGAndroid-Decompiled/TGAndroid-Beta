package org.telegram.tgnet;

public class TLRPC$TL_account_getAuthorizationForm extends TLObject {
    public long bot_id;
    public String public_key;
    public String scope;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_account_authorizationForm.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1456907910);
        abstractSerializedData.writeInt64(this.bot_id);
        abstractSerializedData.writeString(this.scope);
        abstractSerializedData.writeString(this.public_key);
    }
}
