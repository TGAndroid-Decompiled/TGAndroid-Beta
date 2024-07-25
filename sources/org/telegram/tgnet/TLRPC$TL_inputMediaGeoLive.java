package org.telegram.tgnet;
public class TLRPC$TL_inputMediaGeoLive extends TLRPC$InputMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.stopped = (readInt32 & 1) != 0;
        this.geo_point = TLRPC$InputGeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 4) != 0) {
            this.heading = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.period = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8) != 0) {
            this.proximity_notification_radius = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1759532989);
        int i = this.stopped ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.geo_point.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.heading);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.period);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(this.proximity_notification_radius);
        }
    }
}
