package org.telegram.tgnet;

public class TLRPC$TL_messageMediaDocument extends TLRPC$MessageMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.nopremium = (readInt32 & 8) != 0;
        this.spoiler = (readInt32 & 16) != 0;
        this.video = (readInt32 & 64) != 0;
        this.round = (readInt32 & 128) != 0;
        this.voice = (readInt32 & 256) != 0;
        if ((readInt32 & 1) != 0) {
            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 32) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$Document TLdeserialize = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.alt_documents.add(TLdeserialize);
            }
        }
        if ((this.flags & 4) != 0) {
            this.ttl_seconds = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-581497899);
        int i = this.nopremium ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        int i2 = this.spoiler ? i | 16 : i & (-17);
        this.flags = i2;
        int i3 = this.video ? i2 | 64 : i2 & (-65);
        this.flags = i3;
        int i4 = this.round ? i3 | 128 : i3 & (-129);
        this.flags = i4;
        int i5 = this.voice ? i4 | 256 : i4 & (-257);
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
        if ((this.flags & 1) != 0) {
            this.document.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 32) != 0) {
            abstractSerializedData.writeInt32(481674261);
            abstractSerializedData.writeInt32(this.alt_documents.size());
            for (int i6 = 0; i6 < this.alt_documents.size(); i6++) {
                this.alt_documents.get(i6).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.ttl_seconds);
        }
    }
}
