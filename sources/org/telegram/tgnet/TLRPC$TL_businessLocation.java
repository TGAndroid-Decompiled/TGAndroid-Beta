package org.telegram.tgnet;
public class TLRPC$TL_businessLocation extends TLObject {
    public String address;
    public int flags;
    public TLRPC$GeoPoint geo_point;

    public static TLRPC$TL_businessLocation TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != -1403249929) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_businessLocation", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_businessLocation tLRPC$TL_businessLocation = new TLRPC$TL_businessLocation();
        tLRPC$TL_businessLocation.readParams(abstractSerializedData, z);
        return tLRPC$TL_businessLocation;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.geo_point = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.address = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1403249929);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            this.geo_point.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.address);
    }
}
