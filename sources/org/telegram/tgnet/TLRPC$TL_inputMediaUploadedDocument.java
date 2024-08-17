package org.telegram.tgnet;

public class TLRPC$TL_inputMediaUploadedDocument extends TLRPC$InputMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.nosound_video = (readInt32 & 8) != 0;
        this.force_file = (readInt32 & 16) != 0;
        this.spoiler = (readInt32 & 32) != 0;
        this.file = TLRPC$InputFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 4) != 0) {
            this.thumb = TLRPC$InputFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.mime_type = abstractSerializedData.readString(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$DocumentAttribute TLdeserialize = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.attributes.add(TLdeserialize);
        }
        if ((this.flags & 1) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                }
                return;
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt325; i2++) {
                TLRPC$InputDocument TLdeserialize2 = TLRPC$InputDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.stickers.add(TLdeserialize2);
            }
        }
        if ((this.flags & 2) != 0) {
            this.ttl_seconds = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1530447553);
        int i = this.nosound_video ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        int i2 = this.force_file ? i | 16 : i & (-17);
        this.flags = i2;
        int i3 = this.spoiler ? i2 | 32 : i2 & (-33);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        this.file.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            this.thumb.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.mime_type);
        abstractSerializedData.writeInt32(481674261);
        int size = this.attributes.size();
        abstractSerializedData.writeInt32(size);
        for (int i4 = 0; i4 < size; i4++) {
            this.attributes.get(i4).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.stickers.size();
            abstractSerializedData.writeInt32(size2);
            for (int i5 = 0; i5 < size2; i5++) {
                this.stickers.get(i5).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.ttl_seconds);
        }
    }
}
