package org.telegram.tgnet;
public abstract class TLRPC$upload_CdnFile extends TLObject {
    public NativeByteBuffer bytes;
    public byte[] request_token;

    public static TLRPC$upload_CdnFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$upload_CdnFile tLRPC$TL_upload_cdnFile;
        if (i != -1449145777) {
            tLRPC$TL_upload_cdnFile = i != -290921362 ? null : new TLRPC$upload_CdnFile() {
                public static int constructor = -290921362;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.request_token = abstractSerializedData2.readByteArray(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeByteArray(this.request_token);
                }
            };
        } else {
            tLRPC$TL_upload_cdnFile = new TLRPC$TL_upload_cdnFile();
        }
        if (tLRPC$TL_upload_cdnFile == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in upload_CdnFile", Integer.valueOf(i)));
        }
        if (tLRPC$TL_upload_cdnFile != null) {
            tLRPC$TL_upload_cdnFile.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_upload_cdnFile;
    }
}
