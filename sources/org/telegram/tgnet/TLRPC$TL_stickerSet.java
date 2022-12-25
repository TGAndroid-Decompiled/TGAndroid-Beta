package org.telegram.tgnet;

public class TLRPC$TL_stickerSet extends TLRPC$StickerSet {
    public static int constructor = 768691932;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.archived = (readInt32 & 2) != 0;
        this.official = (readInt32 & 4) != 0;
        this.masks = (readInt32 & 8) != 0;
        this.animated = (readInt32 & 32) != 0;
        this.videos = (readInt32 & 64) != 0;
        this.emojis = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
        if ((readInt32 & 1) != 0) {
            this.installed_date = abstractSerializedData.readInt32(z);
        }
        this.f890id = abstractSerializedData.readInt64(z);
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
                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, this.f890id, abstractSerializedData, abstractSerializedData.readInt32(z), z);
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
        abstractSerializedData.writeInt32(constructor);
        int i = this.archived ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.official ? i | 4 : i & (-5);
        this.flags = i2;
        int i3 = this.masks ? i2 | 8 : i2 & (-9);
        this.flags = i3;
        int i4 = this.animated ? i3 | 32 : i3 & (-33);
        this.flags = i4;
        int i5 = this.videos ? i4 | 64 : i4 & (-65);
        this.flags = i5;
        int i6 = this.emojis ? i5 | ConnectionsManager.RequestFlagNeedQuickAck : i5 & (-129);
        this.flags = i6;
        abstractSerializedData.writeInt32(i6);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.installed_date);
        }
        abstractSerializedData.writeInt64(this.f890id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.short_name);
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.thumbs.size();
            abstractSerializedData.writeInt32(size);
            for (int i7 = 0; i7 < size; i7++) {
                this.thumbs.get(i7).serializeToStream(abstractSerializedData);
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
