package org.telegram.tgnet;

public class TLRPC$TL_maskCoords extends TLObject {
    public int n;
    public double x;
    public double y;
    public double zoom;

    public static TLRPC$TL_maskCoords TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1361650766 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_maskCoords", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_maskCoords tLRPC$TL_maskCoords = new TLRPC$TL_maskCoords();
        tLRPC$TL_maskCoords.readParams(abstractSerializedData, z);
        return tLRPC$TL_maskCoords;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.n = abstractSerializedData.readInt32(z);
        this.x = abstractSerializedData.readDouble(z);
        this.y = abstractSerializedData.readDouble(z);
        this.zoom = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1361650766);
        abstractSerializedData.writeInt32(this.n);
        abstractSerializedData.writeDouble(this.x);
        abstractSerializedData.writeDouble(this.y);
        abstractSerializedData.writeDouble(this.zoom);
    }
}
