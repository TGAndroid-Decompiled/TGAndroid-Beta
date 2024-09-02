package org.telegram.tgnet;

public class TLRPC$TL_phoneCallDiscardReasonMissed extends TLRPC$PhoneCallDiscardReason {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2048646399);
    }
}
