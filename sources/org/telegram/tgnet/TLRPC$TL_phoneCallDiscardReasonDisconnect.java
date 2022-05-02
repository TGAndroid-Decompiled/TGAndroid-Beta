package org.telegram.tgnet;

public class TLRPC$TL_phoneCallDiscardReasonDisconnect extends TLRPC$PhoneCallDiscardReason {
    public static int constructor = -527056480;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
