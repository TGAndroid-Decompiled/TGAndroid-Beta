package org.telegram.tgnet;
public class TLRPC$TL_inputWebFileGeoPointLocation extends TLRPC$InputWebFileLocation {
    public static int constructor = -1625153079;
    public long access_hash;
    public TLRPC$InputGeoPoint geo_point;
    public int h;
    public int scale;
    public int w;
    public int zoom;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.geo_point = TLRPC$InputGeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.w = abstractSerializedData.readInt32(z);
        this.h = abstractSerializedData.readInt32(z);
        this.zoom = abstractSerializedData.readInt32(z);
        this.scale = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.geo_point.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeInt32(this.w);
        abstractSerializedData.writeInt32(this.h);
        abstractSerializedData.writeInt32(this.zoom);
        abstractSerializedData.writeInt32(this.scale);
    }
}
