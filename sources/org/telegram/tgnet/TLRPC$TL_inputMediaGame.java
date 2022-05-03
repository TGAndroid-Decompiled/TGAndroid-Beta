package org.telegram.tgnet;

public class TLRPC$TL_inputMediaGame extends TLRPC$InputMedia {
    public static int constructor = -750828557;
    public TLRPC$InputGame id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = TLRPC$InputGame.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.id.serializeToStream(abstractSerializedData);
    }
}
