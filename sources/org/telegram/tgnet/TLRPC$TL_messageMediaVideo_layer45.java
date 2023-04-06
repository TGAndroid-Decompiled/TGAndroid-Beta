package org.telegram.tgnet;
public class TLRPC$TL_messageMediaVideo_layer45 extends TLRPC$MessageMedia {
    public static int constructor = 1540298357;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.video_unused = TLRPC$Video.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.captionLegacy = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.video_unused.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.captionLegacy);
    }
}
