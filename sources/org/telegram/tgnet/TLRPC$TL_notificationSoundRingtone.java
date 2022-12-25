package org.telegram.tgnet;

public class TLRPC$TL_notificationSoundRingtone extends TLRPC$NotificationSound {
    public static int constructor = -9666487;
    public long f959id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f959id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f959id);
    }
}
