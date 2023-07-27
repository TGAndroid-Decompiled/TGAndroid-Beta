package org.telegram.tgnet;
public class TLRPC$TL_inputPrivacyValueAllowContacts extends TLRPC$InputPrivacyRule {
    public static int constructor = 218751099;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
