package org.telegram.tgnet;

public class TLRPC$TL_stickerSet extends TLRPC$StickerSet {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.archived = (readInt32 & 2) != 0;
        this.official = (readInt32 & 4) != 0;
        this.masks = (readInt32 & 8) != 0;
        this.emojis = (readInt32 & 128) != 0;
        this.text_color = (readInt32 & 512) != 0;
        this.channel_emoji_status = (readInt32 & 1024) != 0;
        this.creator = (readInt32 & 2048) != 0;
        if ((readInt32 & 1) != 0) {
            this.installed_date = abstractSerializedData.readInt32(z);
        }
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.title = abstractSerializedData.readString(z);
        this.short_name = abstractSerializedData.readString(z);
        if ((this.flags & 16) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, this.id, abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.thumbs.add(TLdeserialize);
            }
        }
        if ((this.flags & 16) != 0) {
            this.thumb_dc_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 16) != 0) {
            this.thumb_version = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 256) != 0) {
            this.thumb_document_id = abstractSerializedData.readInt64(z);
        }
        this.count = abstractSerializedData.readInt32(z);
        this.hash = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(768691932);
        int i = this.archived ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.official ? i | 4 : i & (-5);
        this.flags = i2;
        int i3 = this.masks ? i2 | 8 : i2 & (-9);
        this.flags = i3;
        int i4 = this.emojis ? i3 | 128 : i3 & (-129);
        this.flags = i4;
        int i5 = this.text_color ? i4 | 512 : i4 & (-513);
        this.flags = i5;
        int i6 = this.channel_emoji_status ? i5 | 1024 : i5 & (-1025);
        this.flags = i6;
        int i7 = this.creator ? i6 | 2048 : i6 & (-2049);
        this.flags = i7;
        abstractSerializedData.writeInt32(i7);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.installed_date);
        }
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.short_name);
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.thumbs.size();
            abstractSerializedData.writeInt32(size);
            for (int i8 = 0; i8 < size; i8++) {
                this.thumbs.get(i8).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.thumb_dc_id);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.thumb_version);
        }
        if ((this.flags & 256) != 0) {
            abstractSerializedData.writeInt64(this.thumb_document_id);
        }
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt32(this.hash);
    }
}
