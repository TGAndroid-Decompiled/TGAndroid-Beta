package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$upload_File extends TLObject {
    public NativeByteBuffer bytes;
    public int dc_id;
    public byte[] encryption_iv;
    public byte[] encryption_key;
    public ArrayList<TLRPC$TL_fileHash> file_hashes = new ArrayList<>();
    public byte[] file_token;
    public int mtime;
    public TLRPC$storage_FileType type;

    public static TLRPC$upload_File TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$upload_File tLRPC$upload_File;
        if (i != -242427324) {
            tLRPC$upload_File = i != 157948117 ? null : new TLRPC$TL_upload_file();
        } else {
            tLRPC$upload_File = new TLRPC$upload_File() {
                public static int constructor = -242427324;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.dc_id = abstractSerializedData2.readInt32(z2);
                    this.file_token = abstractSerializedData2.readByteArray(z2);
                    this.encryption_key = abstractSerializedData2.readByteArray(z2);
                    this.encryption_iv = abstractSerializedData2.readByteArray(z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TLRPC$TL_fileHash TLdeserialize = TLRPC$TL_fileHash.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.file_hashes.add(TLdeserialize);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(this.dc_id);
                    abstractSerializedData2.writeByteArray(this.file_token);
                    abstractSerializedData2.writeByteArray(this.encryption_key);
                    abstractSerializedData2.writeByteArray(this.encryption_iv);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.file_hashes.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.file_hashes.get(i2).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tLRPC$upload_File == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in upload_File", Integer.valueOf(i)));
        }
        if (tLRPC$upload_File != null) {
            tLRPC$upload_File.readParams(abstractSerializedData, z);
        }
        return tLRPC$upload_File;
    }
}
