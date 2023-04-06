package org.telegram.tgnet;
public class TLRPC$TL_inputPrivacyKeyChatInvite extends TLRPC$InputPrivacyKey {
    public static int constructor = -1107622874;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
