package org.telegram.tgnet;

public class TLRPC$TL_pageBlockMap extends TLRPC$PageBlock {
    public TLRPC$TL_pageCaption caption;
    public TLRPC$GeoPoint geo;
    public int h;
    public int w;
    public int zoom;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.zoom = abstractSerializedData.readInt32(z);
        this.w = abstractSerializedData.readInt32(z);
        this.h = abstractSerializedData.readInt32(z);
        this.caption = TLRPC$TL_pageCaption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1538310410);
        this.geo.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.zoom);
        abstractSerializedData.writeInt32(this.w);
        abstractSerializedData.writeInt32(this.h);
        this.caption.serializeToStream(abstractSerializedData);
    }
}
