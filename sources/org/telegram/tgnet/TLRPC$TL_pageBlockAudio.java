package org.telegram.tgnet;

public class TLRPC$TL_pageBlockAudio extends TLRPC$PageBlock {
    public static int constructor = -2143067670;
    public long audio_id;
    public TLRPC$TL_pageCaption caption;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.audio_id = abstractSerializedData.readInt64(z);
        this.caption = TLRPC$TL_pageCaption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.audio_id);
        this.caption.serializeToStream(abstractSerializedData);
    }
}
