package org.telegram.tgnet;
public class TLRPC$TL_privacyValueAllowAll extends TLRPC$PrivacyRule {
    public static int constructor = 1698855810;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
