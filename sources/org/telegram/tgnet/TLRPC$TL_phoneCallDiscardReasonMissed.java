package org.telegram.tgnet;

public class TLRPC$TL_phoneCallDiscardReasonMissed extends TLRPC$PhoneCallDiscardReason {
    public static int constructor = -2048646399;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
