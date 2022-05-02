package org.telegram.tgnet;

public class TLRPC$TL_maskCoords extends TLObject {
    public static int constructor = -1361650766;
    public int f927n;
    public double f928x;
    public double f929y;
    public double zoom;

    public static TLRPC$TL_maskCoords TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_maskCoords tLRPC$TL_maskCoords = new TLRPC$TL_maskCoords();
            tLRPC$TL_maskCoords.readParams(abstractSerializedData, z);
            return tLRPC$TL_maskCoords;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_maskCoords", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f927n = abstractSerializedData.readInt32(z);
        this.f928x = abstractSerializedData.readDouble(z);
        this.f929y = abstractSerializedData.readDouble(z);
        this.zoom = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.f927n);
        abstractSerializedData.writeDouble(this.f928x);
        abstractSerializedData.writeDouble(this.f929y);
        abstractSerializedData.writeDouble(this.zoom);
    }
}
