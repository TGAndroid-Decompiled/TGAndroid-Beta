package org.telegram.tgnet;
public class TLRPC$TL_phoneCallDiscardReasonHangup extends TLRPC$PhoneCallDiscardReason {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1471006352);
    }
}
