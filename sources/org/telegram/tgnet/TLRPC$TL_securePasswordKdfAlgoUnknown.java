package org.telegram.tgnet;

public class TLRPC$TL_securePasswordKdfAlgoUnknown extends TLRPC$SecurePasswordKdfAlgo {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(4883767);
    }
}
