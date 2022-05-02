package org.telegram.tgnet;

public abstract class TLRPC$NotificationSound extends TLObject {
    public static TLRPC$NotificationSound TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$NotificationSound tLRPC$NotificationSound;
        switch (i) {
            case -2096391452:
                tLRPC$NotificationSound = new TLRPC$TL_notificationSoundLocal();
                break;
            case -1746354498:
                tLRPC$NotificationSound = new TLRPC$TL_notificationSoundDefault();
                break;
            case -9666487:
                tLRPC$NotificationSound = new TLRPC$TL_notificationSoundRingtone();
                break;
            case 1863070943:
                tLRPC$NotificationSound = new TLRPC$TL_notificationSoundNone();
                break;
            default:
                tLRPC$NotificationSound = null;
                break;
        }
        if (tLRPC$NotificationSound != null || !z) {
            if (tLRPC$NotificationSound != null) {
                tLRPC$NotificationSound.readParams(abstractSerializedData, z);
            }
            return tLRPC$NotificationSound;
        }
        throw new RuntimeException(String.format("can't parse magic %x in NotificationSound", Integer.valueOf(i)));
    }
}
