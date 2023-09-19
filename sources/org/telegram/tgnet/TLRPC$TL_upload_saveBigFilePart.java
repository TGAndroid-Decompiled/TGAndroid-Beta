package org.telegram.tgnet;
public class TLRPC$TL_upload_saveBigFilePart extends TLObject {
    public static int constructor = -562337987;
    public NativeByteBuffer bytes;
    public long file_id;
    public int file_part;
    public int file_total_parts;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void freeResources() {
        NativeByteBuffer nativeByteBuffer;
        if (this.disableFree || (nativeByteBuffer = this.bytes) == null) {
            return;
        }
        nativeByteBuffer.reuse();
        this.bytes = null;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.file_id);
        abstractSerializedData.writeInt32(this.file_part);
        abstractSerializedData.writeInt32(this.file_total_parts);
        abstractSerializedData.writeByteBuffer(this.bytes);
    }
}
