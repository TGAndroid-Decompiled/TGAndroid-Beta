package org.telegram.tgnet;
public class TLRPC$TL_inputPrivacyKeyAbout extends TLRPC$InputPrivacyKey {
    public static int constructor = 941870144;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
