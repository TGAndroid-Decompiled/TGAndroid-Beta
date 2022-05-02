package org.telegram.tgnet;

public class TLRPC$TL_inputMediaDocument extends TLRPC$InputMedia {
    public static int constructor = 860303448;
    public TLRPC$InputDocument f914id;
    public String query;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.f914id = TLRPC$InputDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.ttl_seconds = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.query = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.f914id.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.ttl_seconds);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.query);
        }
    }
}
