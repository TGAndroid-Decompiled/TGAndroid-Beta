package org.telegram.tgnet;

public abstract class TLRPC$PhoneCallDiscardReason extends TLObject {
    public static TLRPC$PhoneCallDiscardReason TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PhoneCallDiscardReason tLRPC$TL_phoneCallDiscardReasonMissed;
        switch (i) {
            case -2048646399:
                tLRPC$TL_phoneCallDiscardReasonMissed = new TLRPC$TL_phoneCallDiscardReasonMissed();
                break;
            case -527056480:
                tLRPC$TL_phoneCallDiscardReasonMissed = new TLRPC$TL_phoneCallDiscardReasonDisconnect();
                break;
            case -84416311:
                tLRPC$TL_phoneCallDiscardReasonMissed = new TLRPC$TL_phoneCallDiscardReasonBusy();
                break;
            case 1471006352:
                tLRPC$TL_phoneCallDiscardReasonMissed = new TLRPC$TL_phoneCallDiscardReasonHangup();
                break;
            default:
                tLRPC$TL_phoneCallDiscardReasonMissed = null;
                break;
        }
        if (tLRPC$TL_phoneCallDiscardReasonMissed == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PhoneCallDiscardReason", Integer.valueOf(i)));
        }
        if (tLRPC$TL_phoneCallDiscardReasonMissed != null) {
            tLRPC$TL_phoneCallDiscardReasonMissed.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_phoneCallDiscardReasonMissed;
    }
}
