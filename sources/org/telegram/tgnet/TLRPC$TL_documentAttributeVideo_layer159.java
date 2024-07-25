package org.telegram.tgnet;
public class TLRPC$TL_documentAttributeVideo_layer159 extends TLRPC$TL_documentAttributeVideo {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.round_message = (readInt32 & 1) != 0;
        this.supports_streaming = (readInt32 & 2) != 0;
        this.duration = abstractSerializedData.readInt32(z);
        this.w = abstractSerializedData.readInt32(z);
        this.h = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(250621158);
        int i = this.round_message ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.supports_streaming ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt32((int) this.duration);
        abstractSerializedData.writeInt32(this.w);
        abstractSerializedData.writeInt32(this.h);
    }
}
