package org.telegram.tgnet;

public class TLRPC$TL_notificationSoundLocal extends TLRPC$NotificationSound {
    public String data;
    public String title;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.title = abstractSerializedData.readString(z);
        this.data = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2096391452);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.data);
    }
}
