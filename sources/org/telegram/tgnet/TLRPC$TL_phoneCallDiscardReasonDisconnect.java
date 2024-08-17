package org.telegram.tgnet;

public class TLRPC$TL_phoneCallDiscardReasonDisconnect extends TLRPC$PhoneCallDiscardReason {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-527056480);
    }
}
