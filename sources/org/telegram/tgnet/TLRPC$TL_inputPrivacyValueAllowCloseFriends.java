package org.telegram.tgnet;
public class TLRPC$TL_inputPrivacyValueAllowCloseFriends extends TLRPC$InputPrivacyRule {
    public static int constructor = 793067081;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
