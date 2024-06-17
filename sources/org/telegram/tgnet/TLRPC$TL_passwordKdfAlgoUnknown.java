package org.telegram.tgnet;

public class TLRPC$TL_passwordKdfAlgoUnknown extends TLRPC$PasswordKdfAlgo {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-732254058);
    }
}
