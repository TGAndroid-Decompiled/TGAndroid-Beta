package org.telegram.tgnet;

public class TLRPC$TL_notificationSoundDefault extends TLRPC$NotificationSound {
    public static int constructor = -1746354498;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
