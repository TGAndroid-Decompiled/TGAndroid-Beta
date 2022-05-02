package org.telegram.tgnet;

public class TLRPC$TL_inputStickeredMediaPhoto extends TLRPC$InputStickeredMedia {
    public static int constructor = 1251549527;
    public TLRPC$InputPhoto f921id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f921id = TLRPC$InputPhoto.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f921id.serializeToStream(abstractSerializedData);
    }
}
