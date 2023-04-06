package org.telegram.tgnet;
public class TLRPC$TL_video_layer45 extends TLRPC$Video {
    public static int constructor = -148338733;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        this.duration = abstractSerializedData.readInt32(z);
        this.mime_type = abstractSerializedData.readString(z);
        this.size = abstractSerializedData.readInt32(z);
        this.thumb = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.dc_id = abstractSerializedData.readInt32(z);
        this.w = abstractSerializedData.readInt32(z);
        this.h = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.duration);
        abstractSerializedData.writeString(this.mime_type);
        abstractSerializedData.writeInt32(this.size);
        this.thumb.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.dc_id);
        abstractSerializedData.writeInt32(this.w);
        abstractSerializedData.writeInt32(this.h);
    }
}
