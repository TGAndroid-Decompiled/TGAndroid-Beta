package org.telegram.tgnet;
public class TLRPC$TL_inputChatUploadedPhoto extends TLRPC$InputChatPhoto {
    public TLRPC$InputFile file;
    public int flags;
    public TLRPC$InputFile video;
    public TLRPC$VideoSize video_emoji_markup;
    public double video_start_ts;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.file = TLRPC$InputFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.video = TLRPC$InputFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.video_start_ts = abstractSerializedData.readDouble(z);
        }
        if ((this.flags & 8) != 0) {
            this.video_emoji_markup = TLRPC$VideoSize.TLdeserialize(0L, 0L, abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1110593856);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            this.file.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            this.video.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeDouble(this.video_start_ts);
        }
        if ((this.flags & 8) != 0) {
            this.video_emoji_markup.serializeToStream(abstractSerializedData);
        }
    }
}
