package org.telegram.tgnet;

public class TLRPC$TL_document extends TLRPC$Document {
    public static int constructor = -1881881384;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.file_reference = abstractSerializedData.readByteArray(z);
        this.date = abstractSerializedData.readInt32(z);
        this.mime_type = abstractSerializedData.readString(z);
        this.size = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 == 481674261) {
                int readInt322 = abstractSerializedData.readInt32(z);
                int i = 0;
                while (i < readInt322) {
                    int i2 = i;
                    TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, this.id, 0L, abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize != null) {
                        this.thumbs.add(TLdeserialize);
                        i = i2 + 1;
                    } else {
                        return;
                    }
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            } else {
                return;
            }
        }
        if ((this.flags & 2) != 0) {
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 == 481674261) {
                int readInt324 = abstractSerializedData.readInt32(z);
                for (int i3 = 0; i3 < readInt324; i3++) {
                    TLRPC$VideoSize TLdeserialize2 = TLRPC$VideoSize.TLdeserialize(0L, this.id, abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize2 != null) {
                        this.video_thumbs.add(TLdeserialize2);
                    } else {
                        return;
                    }
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            } else {
                return;
            }
        }
        this.dc_id = abstractSerializedData.readInt32(z);
        int readInt325 = abstractSerializedData.readInt32(z);
        if (readInt325 == 481674261) {
            int readInt326 = abstractSerializedData.readInt32(z);
            for (int i4 = 0; i4 < readInt326; i4++) {
                TLRPC$DocumentAttribute TLdeserialize3 = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize3 != null) {
                    this.attributes.add(TLdeserialize3);
                } else {
                    return;
                }
            }
        } else if (z) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeByteArray(this.file_reference);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeString(this.mime_type);
        abstractSerializedData.writeInt64(this.size);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.thumbs.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.thumbs.get(i).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.video_thumbs.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                this.video_thumbs.get(i2).serializeToStream(abstractSerializedData);
            }
        }
        abstractSerializedData.writeInt32(this.dc_id);
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.attributes.size();
        abstractSerializedData.writeInt32(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            this.attributes.get(i3).serializeToStream(abstractSerializedData);
        }
    }
}
