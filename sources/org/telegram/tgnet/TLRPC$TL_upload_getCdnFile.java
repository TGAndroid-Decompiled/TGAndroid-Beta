package org.telegram.tgnet;

public class TLRPC$TL_upload_getCdnFile extends TLObject {
    public byte[] file_token;
    public int limit;
    public long offset;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$upload_CdnFile.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(962554330);
        abstractSerializedData.writeByteArray(this.file_token);
        abstractSerializedData.writeInt64(this.offset);
        abstractSerializedData.writeInt32(this.limit);
    }
}
