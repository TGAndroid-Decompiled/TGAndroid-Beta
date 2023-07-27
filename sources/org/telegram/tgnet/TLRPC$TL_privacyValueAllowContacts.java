package org.telegram.tgnet;
public class TLRPC$TL_privacyValueAllowContacts extends TLRPC$PrivacyRule {
    public static int constructor = -123988;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
