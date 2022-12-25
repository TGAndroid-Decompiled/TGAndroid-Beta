package org.telegram.tgnet;

public class TLRPC$TL_pageBlockMap extends TLRPC$PageBlock {
    public static int constructor = -1538310410;
    public TLRPC$TL_pageCaption caption;
    public TLRPC$GeoPoint geo;
    public int f964h;
    public int f965w;
    public int zoom;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.zoom = abstractSerializedData.readInt32(z);
        this.f965w = abstractSerializedData.readInt32(z);
        this.f964h = abstractSerializedData.readInt32(z);
        this.caption = TLRPC$TL_pageCaption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.geo.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.zoom);
        abstractSerializedData.writeInt32(this.f965w);
        abstractSerializedData.writeInt32(this.f964h);
        this.caption.serializeToStream(abstractSerializedData);
    }
}
