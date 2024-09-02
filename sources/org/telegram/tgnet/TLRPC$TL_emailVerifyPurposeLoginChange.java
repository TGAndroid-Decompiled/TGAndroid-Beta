package org.telegram.tgnet;

public class TLRPC$TL_emailVerifyPurposeLoginChange extends TLRPC$EmailVerifyPurpose {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1383932651);
    }
}
