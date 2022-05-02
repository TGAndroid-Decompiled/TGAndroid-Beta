package org.telegram.tgnet;

public class TLRPC$TL_account_tmpPassword extends TLObject {
    public static int constructor = -614138572;
    public byte[] tmp_password;
    public int valid_until;

    public static TLRPC$TL_account_tmpPassword TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_account_tmpPassword tLRPC$TL_account_tmpPassword = new TLRPC$TL_account_tmpPassword();
            tLRPC$TL_account_tmpPassword.readParams(abstractSerializedData, z);
            return tLRPC$TL_account_tmpPassword;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_account_tmpPassword", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.tmp_password = abstractSerializedData.readByteArray(z);
        this.valid_until = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeByteArray(this.tmp_password);
        abstractSerializedData.writeInt32(this.valid_until);
    }
}
