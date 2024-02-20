package org.telegram.tgnet;
public class TLRPC$TL_phoneCallDiscardReasonBusy extends TLRPC$PhoneCallDiscardReason {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-84416311);
    }
}
