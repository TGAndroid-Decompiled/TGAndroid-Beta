package org.telegram.tgnet;

public abstract class TLRPC$account_ResetPasswordResult extends TLObject {
    public static TLRPC$account_ResetPasswordResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_ResetPasswordResult tLRPC$account_ResetPasswordResult;
        if (i == -478701471) {
            tLRPC$account_ResetPasswordResult = new TLRPC$TL_account_resetPasswordFailedWait();
        } else if (i != -383330754) {
            tLRPC$account_ResetPasswordResult = i != -370148227 ? null : new TLRPC$TL_account_resetPasswordRequestedWait();
        } else {
            tLRPC$account_ResetPasswordResult = new TLRPC$account_ResetPasswordResult() {
                public static int constructor = -383330754;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        }
        if (tLRPC$account_ResetPasswordResult != null || !z) {
            if (tLRPC$account_ResetPasswordResult != null) {
                tLRPC$account_ResetPasswordResult.readParams(abstractSerializedData, z);
            }
            return tLRPC$account_ResetPasswordResult;
        }
        throw new RuntimeException(String.format("can't parse magic %x in account_ResetPasswordResult", Integer.valueOf(i)));
    }
}
