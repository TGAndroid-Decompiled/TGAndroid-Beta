package org.telegram.tgnet;

public class TLRPC$TL_notificationSoundLocal extends TLRPC$NotificationSound {
    public static int constructor = -2096391452;
    public String data;
    public String title;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.title = abstractSerializedData.readString(z);
        this.data = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.data);
    }
}
