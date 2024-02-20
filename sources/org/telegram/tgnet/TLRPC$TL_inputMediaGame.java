package org.telegram.tgnet;
public class TLRPC$TL_inputMediaGame extends TLRPC$InputMedia {
    public TLRPC$InputGame id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = TLRPC$InputGame.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-750828557);
        this.id.serializeToStream(abstractSerializedData);
    }
}
