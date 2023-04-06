package org.telegram.tgnet;
public class TLRPC$TL_phoneCallDiscardReasonHangup extends TLRPC$PhoneCallDiscardReason {
    public static int constructor = 1471006352;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
