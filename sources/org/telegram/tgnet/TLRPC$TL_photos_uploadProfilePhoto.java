package org.telegram.tgnet;
public class TLRPC$TL_photos_uploadProfilePhoto extends TLObject {
    public TLRPC$InputUser bot;
    public boolean fallback;
    public TLRPC$InputFile file;
    public int flags;
    public TLRPC$InputFile video;
    public TLRPC$VideoSize video_emoji_markup;
    public double video_start_ts;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_photos_photo.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(59286453);
        int i = this.fallback ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 32) != 0) {
            this.bot.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            this.file.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            this.video.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeDouble(this.video_start_ts);
        }
        if ((this.flags & 16) != 0) {
            this.video_emoji_markup.serializeToStream(abstractSerializedData);
        }
    }
}
