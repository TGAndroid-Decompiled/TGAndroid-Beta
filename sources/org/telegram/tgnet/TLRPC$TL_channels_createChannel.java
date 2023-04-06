package org.telegram.tgnet;
public class TLRPC$TL_channels_createChannel extends TLObject {
    public static int constructor = -1862244601;
    public String about;
    public String address;
    public boolean broadcast;
    public int flags;
    public boolean for_import;
    public boolean forum;
    public TLRPC$InputGeoPoint geo_point;
    public boolean megagroup;
    public String title;
    public int ttl_period;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.broadcast ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.megagroup ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.for_import ? i2 | 8 : i2 & (-9);
        this.flags = i3;
        int i4 = this.forum ? i3 | 32 : i3 & (-33);
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.about);
        if ((this.flags & 4) != 0) {
            this.geo_point.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.address);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.ttl_period);
        }
    }
}
