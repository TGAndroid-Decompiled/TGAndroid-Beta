package org.telegram.tgnet;
public class TLRPC$TL_account_updateUsername extends TLObject {
    public static int constructor = 1040964988;
    public String username;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$User.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.username);
    }
}
