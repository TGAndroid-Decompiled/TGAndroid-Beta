package org.telegram.tgnet;

public class TLRPC$TL_messageExtendedMediaPreview extends TLRPC$MessageExtendedMedia {
    public static int constructor = -1386050360;
    public int flags;
    public int f936h;
    public TLRPC$PhotoSize thumb;
    public int video_duration;
    public int f937w;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.f937w = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1) != 0) {
            this.f936h = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.thumb = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.video_duration = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.f937w);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.f936h);
        }
        if ((this.flags & 2) != 0) {
            this.thumb.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.video_duration);
        }
    }
}
