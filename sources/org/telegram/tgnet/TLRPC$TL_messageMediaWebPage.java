package org.telegram.tgnet;

public class TLRPC$TL_messageMediaWebPage extends TLRPC$MessageMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.force_large_media = (readInt32 & 1) != 0;
        this.force_small_media = (readInt32 & 2) != 0;
        this.manual = (readInt32 & 8) != 0;
        this.safe = (readInt32 & 16) != 0;
        this.webpage = TLRPC$WebPage.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-571405253);
        int i = this.force_large_media ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.force_small_media ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.manual ? i2 | 8 : i2 & (-9);
        this.flags = i3;
        int i4 = this.safe ? i3 | 16 : i3 & (-17);
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        this.webpage.serializeToStream(abstractSerializedData);
    }
}
