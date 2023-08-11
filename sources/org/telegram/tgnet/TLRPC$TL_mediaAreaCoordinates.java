package org.telegram.tgnet;
public class TLRPC$TL_mediaAreaCoordinates extends TLObject {
    public double h;
    public double rotation;
    public double w;
    public double x;
    public double y;

    public static TLRPC$TL_mediaAreaCoordinates TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (64088654 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_mediaAreaCoordinates", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_mediaAreaCoordinates tLRPC$TL_mediaAreaCoordinates = new TLRPC$TL_mediaAreaCoordinates();
        tLRPC$TL_mediaAreaCoordinates.readParams(abstractSerializedData, z);
        return tLRPC$TL_mediaAreaCoordinates;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.x = abstractSerializedData.readDouble(z);
        this.y = abstractSerializedData.readDouble(z);
        this.w = abstractSerializedData.readDouble(z);
        this.h = abstractSerializedData.readDouble(z);
        this.rotation = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(64088654);
        abstractSerializedData.writeDouble(this.x);
        abstractSerializedData.writeDouble(this.y);
        abstractSerializedData.writeDouble(this.w);
        abstractSerializedData.writeDouble(this.h);
        abstractSerializedData.writeDouble(this.rotation);
    }
}
