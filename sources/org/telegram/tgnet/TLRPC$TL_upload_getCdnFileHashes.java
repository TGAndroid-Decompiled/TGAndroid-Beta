package org.telegram.tgnet;

public class TLRPC$TL_upload_getCdnFileHashes extends TLObject {
    public byte[] file_token;
    public long offset;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
        int readInt32 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt32; i2++) {
            TLRPC$TL_fileHash TLdeserialize = TLRPC$TL_fileHash.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return tLRPC$Vector;
            }
            tLRPC$Vector.objects.add(TLdeserialize);
        }
        return tLRPC$Vector;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1847836879);
        abstractSerializedData.writeByteArray(this.file_token);
        abstractSerializedData.writeInt64(this.offset);
    }
}
