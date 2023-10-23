package org.telegram.tgnet;
public class TLRPC$TL_messageMediaGeo extends TLRPC$MessageMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1457575028);
        this.geo.serializeToStream(abstractSerializedData);
    }
}
