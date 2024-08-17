package org.telegram.tgnet;

public class TLRPC$TL_upload_cdnFile extends TLRPC$upload_CdnFile {
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
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.bytes = abstractSerializedData.readByteBuffer(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1449145777);
        abstractSerializedData.writeByteBuffer(this.bytes);
    }
}
