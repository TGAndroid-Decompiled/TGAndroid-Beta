package org.telegram.tgnet;
public class TLRPC$TL_account_resetPasswordRequestedWait extends TLRPC$account_ResetPasswordResult {
    public int until_date;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.until_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-370148227);
        abstractSerializedData.writeInt32(this.until_date);
    }
}
