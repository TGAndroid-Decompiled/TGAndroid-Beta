package org.telegram.tgnet;

public class TLRPC$TL_upload_saveFilePart extends TLObject {
    public NativeByteBuffer bytes;
    public long file_id;
    public int file_part;

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
        abstractSerializedData.writeInt32(-1291540959);
        abstractSerializedData.writeInt64(this.file_id);
        abstractSerializedData.writeInt32(this.file_part);
        abstractSerializedData.writeByteBuffer(this.bytes);
    }
}
