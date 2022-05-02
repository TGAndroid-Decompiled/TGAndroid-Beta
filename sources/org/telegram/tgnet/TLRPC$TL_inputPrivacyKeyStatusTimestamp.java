package org.telegram.tgnet;

public class TLRPC$TL_inputPrivacyKeyStatusTimestamp extends TLRPC$InputPrivacyKey {
    public static int constructor = 1335282456;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
