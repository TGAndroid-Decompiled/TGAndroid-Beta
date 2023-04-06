package org.telegram.tgnet;
public class TLRPC$TL_messageMediaVenue extends TLRPC$MessageMedia {
    public static int constructor = 784356159;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.title = abstractSerializedData.readString(z);
        this.address = abstractSerializedData.readString(z);
        this.provider = abstractSerializedData.readString(z);
        this.venue_id = abstractSerializedData.readString(z);
        this.venue_type = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.geo.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.address);
        abstractSerializedData.writeString(this.provider);
        abstractSerializedData.writeString(this.venue_id);
        abstractSerializedData.writeString(this.venue_type);
    }
}
