package org.telegram.tgnet;

public abstract class TLRPC$account_ResetPasswordResult extends TLObject {
    public static TLRPC$account_ResetPasswordResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_ResetPasswordResult tLRPC$TL_account_resetPasswordRequestedWait = i != -478701471 ? i != -383330754 ? i != -370148227 ? null : new TLRPC$TL_account_resetPasswordRequestedWait() : new TLRPC$account_ResetPasswordResult() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-383330754);
            }
        } : new TLRPC$TL_account_resetPasswordFailedWait();
        if (tLRPC$TL_account_resetPasswordRequestedWait == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in account_ResetPasswordResult", Integer.valueOf(i)));
        }
        if (tLRPC$TL_account_resetPasswordRequestedWait != null) {
            tLRPC$TL_account_resetPasswordRequestedWait.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_account_resetPasswordRequestedWait;
    }
}
