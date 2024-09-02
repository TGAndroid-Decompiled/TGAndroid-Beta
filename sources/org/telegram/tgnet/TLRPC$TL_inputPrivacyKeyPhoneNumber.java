package org.telegram.tgnet;

public class TLRPC$TL_inputPrivacyKeyPhoneNumber extends TLRPC$InputPrivacyKey {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(55761658);
    }
}
