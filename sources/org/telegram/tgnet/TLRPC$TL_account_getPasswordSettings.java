package org.telegram.tgnet;
public class TLRPC$TL_account_getPasswordSettings extends TLObject {
    public TLRPC$InputCheckPasswordSRP password;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_account_passwordSettings.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1663767815);
        this.password.serializeToStream(abstractSerializedData);
    }
}
