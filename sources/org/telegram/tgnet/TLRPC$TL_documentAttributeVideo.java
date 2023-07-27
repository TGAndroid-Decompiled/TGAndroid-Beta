package org.telegram.tgnet;
public class TLRPC$TL_documentAttributeVideo extends TLRPC$DocumentAttribute {
    public static int constructor = -745541182;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.round_message = (readInt32 & 1) != 0;
        this.supports_streaming = (readInt32 & 2) != 0;
        this.nosound = (readInt32 & 8) != 0;
        this.duration = abstractSerializedData.readDouble(z);
        this.w = abstractSerializedData.readInt32(z);
        this.h = abstractSerializedData.readInt32(z);
        if ((this.flags & 4) != 0) {
            this.preload_prefix_size = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.round_message ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.supports_streaming ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.nosound ? i2 | 8 : i2 & (-9);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        abstractSerializedData.writeDouble(this.duration);
        abstractSerializedData.writeInt32(this.w);
        abstractSerializedData.writeInt32(this.h);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.preload_prefix_size);
        }
    }
}
