package org.telegram.tgnet;

public class TLRPC$TL_inputPrivacyKeyProfilePhoto extends TLRPC$InputPrivacyKey {
    public static int constructor = 1461304012;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
