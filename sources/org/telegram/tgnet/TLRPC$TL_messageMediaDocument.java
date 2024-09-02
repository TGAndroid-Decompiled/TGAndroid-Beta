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
            this.alt_document = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.ttl_seconds = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1291114285);
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
            this.alt_document.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.ttl_seconds);
        }
    }
}
