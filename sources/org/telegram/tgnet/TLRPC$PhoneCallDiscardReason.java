package org.telegram.tgnet;

public abstract class TLRPC$PhoneCallDiscardReason extends TLObject {
    public static TLRPC$PhoneCallDiscardReason TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PhoneCallDiscardReason tLRPC$TL_phoneCallDiscardReasonHangup = i != -2048646399 ? i != -527056480 ? i != -84416311 ? i != 1471006352 ? null : new TLRPC$TL_phoneCallDiscardReasonHangup() : new TLRPC$TL_phoneCallDiscardReasonBusy() : new TLRPC$TL_phoneCallDiscardReasonDisconnect() : new TLRPC$TL_phoneCallDiscardReasonMissed();
        if (tLRPC$TL_phoneCallDiscardReasonHangup == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PhoneCallDiscardReason", Integer.valueOf(i)));
        }
        if (tLRPC$TL_phoneCallDiscardReasonHangup != null) {
            tLRPC$TL_phoneCallDiscardReasonHangup.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_phoneCallDiscardReasonHangup;
    }
}
