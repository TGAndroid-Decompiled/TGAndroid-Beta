package org.telegram.tgnet;
public class TLRPC$TL_auth_checkPassword extends TLObject {
    public static int constructor = -779399914;
    public TLRPC$InputCheckPasswordSRP password;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$auth_Authorization.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.password.serializeToStream(abstractSerializedData);
    }
}
