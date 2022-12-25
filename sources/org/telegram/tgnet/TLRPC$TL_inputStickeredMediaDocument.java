package org.telegram.tgnet;

public class TLRPC$TL_inputStickeredMediaDocument extends TLRPC$InputStickeredMedia {
    public static int constructor = 70813275;
    public TLRPC$InputDocument f926id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f926id = TLRPC$InputDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f926id.serializeToStream(abstractSerializedData);
    }
}
