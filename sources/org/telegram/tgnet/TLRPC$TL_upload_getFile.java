package org.telegram.tgnet;

public class TLRPC$TL_upload_getFile extends TLObject {
    public static int constructor = -1101843010;
    public boolean cdn_supported;
    public int flags;
    public int limit;
    public TLRPC$InputFileLocation location;
    public long offset;
    public boolean precise;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$upload_File.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.precise ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.cdn_supported ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.location.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.offset);
        abstractSerializedData.writeInt32(this.limit);
    }
}
