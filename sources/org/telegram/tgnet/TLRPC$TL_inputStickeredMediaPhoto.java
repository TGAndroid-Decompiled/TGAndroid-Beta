package org.telegram.tgnet;

public class TLRPC$TL_inputStickeredMediaPhoto extends TLRPC$InputStickeredMedia {
    public static int constructor = 1251549527;
    public TLRPC$InputPhoto f918id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f918id = TLRPC$InputPhoto.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f918id.serializeToStream(abstractSerializedData);
    }
}
