package org.telegram.tgnet;

public class TLRPC$TL_inputChatPhoto extends TLRPC$InputChatPhoto {
    public static int constructor = -1991004873;
    public TLRPC$InputPhoto f907id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f907id = TLRPC$InputPhoto.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f907id.serializeToStream(abstractSerializedData);
    }
}
