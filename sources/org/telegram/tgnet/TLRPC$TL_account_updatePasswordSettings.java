package org.telegram.tgnet;
public class TLRPC$TL_account_updatePasswordSettings extends TLObject {
    public static int constructor = -1516564433;
    public TLRPC$TL_account_passwordInputSettings new_settings;
    public TLRPC$InputCheckPasswordSRP password;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.password.serializeToStream(abstractSerializedData);
        this.new_settings.serializeToStream(abstractSerializedData);
    }
}
