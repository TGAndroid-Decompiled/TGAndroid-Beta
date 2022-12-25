package org.telegram.tgnet;

public class TLRPC$TL_statsAbsValueAndPrev extends TLObject {
    public static int constructor = -884757282;
    public double current;
    public double previous;

    public static TLRPC$TL_statsAbsValueAndPrev TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_statsAbsValueAndPrev", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_statsAbsValueAndPrev tLRPC$TL_statsAbsValueAndPrev = new TLRPC$TL_statsAbsValueAndPrev();
        tLRPC$TL_statsAbsValueAndPrev.readParams(abstractSerializedData, z);
        return tLRPC$TL_statsAbsValueAndPrev;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.current = abstractSerializedData.readDouble(z);
        this.previous = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeDouble(this.current);
        abstractSerializedData.writeDouble(this.previous);
    }
}
