package org.telegram.tgnet;

public abstract class TLRPC$EncryptedFile extends TLObject {
    public long access_hash;
    public int dc_id;
    public long id;
    public int key_fingerprint;
    public long size;

    public static TLRPC$EncryptedFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EncryptedFile tLRPC$EncryptedFile = i != -1476358952 ? i != -1038136962 ? i != 1248893260 ? null : new TLRPC$EncryptedFile() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.id = abstractSerializedData2.readInt64(z2);
                this.access_hash = abstractSerializedData2.readInt64(z2);
                this.size = abstractSerializedData2.readInt32(z2);
                this.dc_id = abstractSerializedData2.readInt32(z2);
                this.key_fingerprint = abstractSerializedData2.readInt32(z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1248893260);
                abstractSerializedData2.writeInt64(this.id);
                abstractSerializedData2.writeInt64(this.access_hash);
                abstractSerializedData2.writeInt32((int) this.size);
                abstractSerializedData2.writeInt32(this.dc_id);
                abstractSerializedData2.writeInt32(this.key_fingerprint);
            }
        } : new TLRPC$EncryptedFile() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1038136962);
            }
        } : new TLRPC$EncryptedFile() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.id = abstractSerializedData2.readInt64(z2);
                this.access_hash = abstractSerializedData2.readInt64(z2);
                this.size = abstractSerializedData2.readInt64(z2);
                this.dc_id = abstractSerializedData2.readInt32(z2);
                this.key_fingerprint = abstractSerializedData2.readInt32(z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1476358952);
                abstractSerializedData2.writeInt64(this.id);
                abstractSerializedData2.writeInt64(this.access_hash);
                abstractSerializedData2.writeInt64(this.size);
                abstractSerializedData2.writeInt32(this.dc_id);
                abstractSerializedData2.writeInt32(this.key_fingerprint);
            }
        };
        if (tLRPC$EncryptedFile == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in EncryptedFile", Integer.valueOf(i)));
        }
        if (tLRPC$EncryptedFile != null) {
            tLRPC$EncryptedFile.readParams(abstractSerializedData, z);
        }
        return tLRPC$EncryptedFile;
    }
}
