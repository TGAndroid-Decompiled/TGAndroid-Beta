package org.telegram.tgnet;

public class TLRPC$TL_auth_passwordRecovery extends TLObject {
    public static int constructor = 326715557;
    public String email_pattern;

    public static TLRPC$TL_auth_passwordRecovery TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_auth_passwordRecovery", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_auth_passwordRecovery tLRPC$TL_auth_passwordRecovery = new TLRPC$TL_auth_passwordRecovery();
        tLRPC$TL_auth_passwordRecovery.readParams(abstractSerializedData, z);
        return tLRPC$TL_auth_passwordRecovery;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.email_pattern = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.email_pattern);
    }
}
