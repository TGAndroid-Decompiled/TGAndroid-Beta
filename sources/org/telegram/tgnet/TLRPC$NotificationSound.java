package org.telegram.tgnet;
public abstract class TLRPC$NotificationSound extends TLObject {
    public static TLRPC$NotificationSound TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$NotificationSound tLRPC$TL_notificationSoundLocal;
        switch (i) {
            case -2096391452:
                tLRPC$TL_notificationSoundLocal = new TLRPC$TL_notificationSoundLocal();
                break;
            case -1746354498:
                tLRPC$TL_notificationSoundLocal = new TLRPC$TL_notificationSoundDefault();
                break;
            case -9666487:
                tLRPC$TL_notificationSoundLocal = new TLRPC$TL_notificationSoundRingtone();
                break;
            case 1863070943:
                tLRPC$TL_notificationSoundLocal = new TLRPC$TL_notificationSoundNone();
                break;
            default:
                tLRPC$TL_notificationSoundLocal = null;
                break;
        }
        if (tLRPC$TL_notificationSoundLocal == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in NotificationSound", Integer.valueOf(i)));
        }
        if (tLRPC$TL_notificationSoundLocal != null) {
            tLRPC$TL_notificationSoundLocal.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_notificationSoundLocal;
    }
}
