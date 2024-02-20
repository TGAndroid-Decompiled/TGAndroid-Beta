package org.telegram.tgnet;
public class TLRPC$TL_messageExtendedMedia extends TLRPC$MessageExtendedMedia {
    public TLRPC$MessageMedia media;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.media = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-297296796);
        this.media.serializeToStream(abstractSerializedData);
    }
}
