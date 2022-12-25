package org.telegram.tgnet;

public class TLRPC$TL_maskCoords extends TLObject {
    public static int constructor = -1361650766;
    public int f933n;
    public double f934x;
    public double f935y;
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
        this.f933n = abstractSerializedData.readInt32(z);
        this.f934x = abstractSerializedData.readDouble(z);
        this.f935y = abstractSerializedData.readDouble(z);
        this.zoom = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.f933n);
        abstractSerializedData.writeDouble(this.f934x);
        abstractSerializedData.writeDouble(this.f935y);
        abstractSerializedData.writeDouble(this.zoom);
    }
}
