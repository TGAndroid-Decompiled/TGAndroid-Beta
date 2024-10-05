package org.telegram.tgnet;

public abstract class TLRPC$NotificationSound extends TLObject {
    public static TLRPC$NotificationSound TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$NotificationSound tLRPC$TL_notificationSoundNone = i != -2096391452 ? i != -1746354498 ? i != -9666487 ? i != 1863070943 ? null : new TLRPC$TL_notificationSoundNone() : new TLRPC$TL_notificationSoundRingtone() : new TLRPC$TL_notificationSoundDefault() : new TLRPC$TL_notificationSoundLocal();
        if (tLRPC$TL_notificationSoundNone == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in NotificationSound", Integer.valueOf(i)));
        }
        if (tLRPC$TL_notificationSoundNone != null) {
            tLRPC$TL_notificationSoundNone.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_notificationSoundNone;
    }
}
