package org.telegram.tgnet;
public class TLRPC$TL_inputGroupCallStream extends TLRPC$InputFileLocation {
    public static int constructor = 93890858;
    public TLRPC$TL_inputGroupCall call;
    public int scale;
    public long time_ms;
    public int video_channel;
    public int video_quality;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.time_ms = abstractSerializedData.readInt64(z);
        this.scale = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.video_channel = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1) != 0) {
            this.video_quality = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.call.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.time_ms);
        abstractSerializedData.writeInt32(this.scale);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.video_channel);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.video_quality);
        }
    }
}
