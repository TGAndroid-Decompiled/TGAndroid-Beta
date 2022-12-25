package org.telegram.tgnet;

public class TLRPC$TL_maskCoords extends TLObject {
    public static int constructor = -1361650766;
    public int f924n;
    public double f925x;
    public double f926y;
    public double zoom;

    public static TLRPC$TL_maskCoords TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
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
        this.f924n = abstractSerializedData.readInt32(z);
        this.f925x = abstractSerializedData.readDouble(z);
        this.f926y = abstractSerializedData.readDouble(z);
        this.zoom = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.f924n);
        abstractSerializedData.writeDouble(this.f925x);
        abstractSerializedData.writeDouble(this.f926y);
        abstractSerializedData.writeDouble(this.zoom);
    }
}
