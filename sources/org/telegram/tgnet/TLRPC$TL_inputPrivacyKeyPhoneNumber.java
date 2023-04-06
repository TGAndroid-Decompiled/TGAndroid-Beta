package org.telegram.tgnet;
public class TLRPC$TL_inputPrivacyKeyPhoneNumber extends TLRPC$InputPrivacyKey {
    public static int constructor = 55761658;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
