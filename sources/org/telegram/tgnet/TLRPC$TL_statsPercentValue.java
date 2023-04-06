package org.telegram.tgnet;
public class TLRPC$TL_statsPercentValue extends TLObject {
    public static int constructor = -875679776;
    public double part;
    public double total;

    public static TLRPC$TL_statsPercentValue TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_statsPercentValue", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_statsPercentValue tLRPC$TL_statsPercentValue = new TLRPC$TL_statsPercentValue();
        tLRPC$TL_statsPercentValue.readParams(abstractSerializedData, z);
        return tLRPC$TL_statsPercentValue;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.part = abstractSerializedData.readDouble(z);
        this.total = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeDouble(this.part);
        abstractSerializedData.writeDouble(this.total);
    }
}
