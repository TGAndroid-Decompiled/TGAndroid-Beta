package org.telegram.tgnet;
public class TLRPC$TL_inputMediaWebPage extends TLRPC$InputMedia {
    public boolean force_large_media;
    public boolean force_small_media;
    public boolean optional;
    public String url;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.force_large_media = (readInt32 & 1) != 0;
        this.force_small_media = (readInt32 & 2) != 0;
        this.optional = (readInt32 & 4) != 0;
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1038383031);
        int i = this.force_large_media ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.force_small_media ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.optional ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        abstractSerializedData.writeString(this.url);
    }
}
