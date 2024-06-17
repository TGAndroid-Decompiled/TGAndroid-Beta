package org.telegram.tgnet;

public class TLRPC$TL_privacyValueAllowCloseFriends extends TLRPC$PrivacyRule {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-135735141);
    }
}
