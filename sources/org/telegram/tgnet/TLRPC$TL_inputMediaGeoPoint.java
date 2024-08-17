package org.telegram.tgnet;

public class TLRPC$TL_inputMediaGeoPoint extends TLRPC$InputMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.geo_point = TLRPC$InputGeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-104578748);
        this.geo_point.serializeToStream(abstractSerializedData);
    }
}
