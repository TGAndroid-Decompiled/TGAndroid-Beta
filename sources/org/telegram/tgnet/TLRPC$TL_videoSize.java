package org.telegram.tgnet;
public class TLRPC$TL_videoSize extends TLRPC$VideoSize {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.type = abstractSerializedData.readString(z);
        this.w = abstractSerializedData.readInt32(z);
        this.h = abstractSerializedData.readInt32(z);
        this.size = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.video_start_ts = abstractSerializedData.readDouble(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-567037804);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.type);
        abstractSerializedData.writeInt32(this.w);
        abstractSerializedData.writeInt32(this.h);
        abstractSerializedData.writeInt32(this.size);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeDouble(this.video_start_ts);
        }
    }
}
