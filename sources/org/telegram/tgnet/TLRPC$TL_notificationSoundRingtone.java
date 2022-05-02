package org.telegram.tgnet;

public class TLRPC$TL_notificationSoundRingtone extends TLRPC$NotificationSound {
    public static int constructor = -9666487;
    public long f958id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f958id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f958id);
    }
}
