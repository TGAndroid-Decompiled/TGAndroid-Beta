package org.telegram.tgnet;
public class TLRPC$TL_inputMediaPhoto extends TLRPC$InputMedia {
    public static int constructor = -1279654347;
    public TLRPC$InputPhoto id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.spoiler = (readInt32 & 2) != 0;
        this.id = TLRPC$InputPhoto.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.ttl_seconds = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.spoiler ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.id.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.ttl_seconds);
        }
    }
}
