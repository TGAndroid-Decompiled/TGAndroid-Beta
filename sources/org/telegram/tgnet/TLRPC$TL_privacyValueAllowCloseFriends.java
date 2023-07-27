package org.telegram.tgnet;
public class TLRPC$TL_privacyValueAllowCloseFriends extends TLRPC$PrivacyRule {
    public static int constructor = -135735141;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
