package org.telegram.tgnet;

public class TLRPC$TL_inputPrivacyKeyVoiceMessages extends TLRPC$InputPrivacyKey {
    public static int constructor = -1360618136;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
