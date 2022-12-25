package org.telegram.tgnet;

public class TLRPC$TL_inputMediaGame extends TLRPC$InputMedia {
    public static int constructor = -750828557;
    public TLRPC$InputGame f912id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f912id = TLRPC$InputGame.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f912id.serializeToStream(abstractSerializedData);
    }
}
