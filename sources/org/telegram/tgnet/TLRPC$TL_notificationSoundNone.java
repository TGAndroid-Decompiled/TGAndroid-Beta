package org.telegram.tgnet;

public class TLRPC$TL_notificationSoundNone extends TLRPC$NotificationSound {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1863070943);
    }
}
