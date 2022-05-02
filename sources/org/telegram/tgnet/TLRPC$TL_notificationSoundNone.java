package org.telegram.tgnet;

public class TLRPC$TL_notificationSoundNone extends TLRPC$NotificationSound {
    public static int constructor = 1863070943;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
