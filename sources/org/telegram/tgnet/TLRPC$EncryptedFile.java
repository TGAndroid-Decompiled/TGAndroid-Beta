package org.telegram.tgnet;

public abstract class TLRPC$EncryptedFile extends TLObject {
    public long access_hash;
    public int dc_id;
    public long f870id;
    public int key_fingerprint;
    public long size;

    public static TLRPC$EncryptedFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EncryptedFile tLRPC$EncryptedFile;
        if (i == -1476358952) {
            tLRPC$EncryptedFile = new TLRPC$EncryptedFile() {
                public static int constructor = -1476358952;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.f870id = abstractSerializedData2.readInt64(z2);
                    this.access_hash = abstractSerializedData2.readInt64(z2);
                    this.size = abstractSerializedData2.readInt64(z2);
                    this.dc_id = abstractSerializedData2.readInt32(z2);
                    this.key_fingerprint = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt64(this.f870id);
                    abstractSerializedData2.writeInt64(this.access_hash);
                    abstractSerializedData2.writeInt64(this.size);
                    abstractSerializedData2.writeInt32(this.dc_id);
                    abstractSerializedData2.writeInt32(this.key_fingerprint);
                }
            };
        } else if (i != -1038136962) {
            tLRPC$EncryptedFile = i != 1248893260 ? null : new TLRPC$EncryptedFile() {
                public static int constructor = 1248893260;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.f870id = abstractSerializedData2.readInt64(z2);
                    this.access_hash = abstractSerializedData2.readInt64(z2);
                    this.size = abstractSerializedData2.readInt32(z2);
                    this.dc_id = abstractSerializedData2.readInt32(z2);
                    this.key_fingerprint = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt64(this.f870id);
                    abstractSerializedData2.writeInt64(this.access_hash);
                    abstractSerializedData2.writeInt32((int) this.size);
                    abstractSerializedData2.writeInt32(this.dc_id);
                    abstractSerializedData2.writeInt32(this.key_fingerprint);
                }
            };
        } else {
            tLRPC$EncryptedFile = new TLRPC$EncryptedFile() {
                public static int constructor = -1038136962;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        }
        if (tLRPC$EncryptedFile == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in EncryptedFile", Integer.valueOf(i)));
        }
        if (tLRPC$EncryptedFile != null) {
            tLRPC$EncryptedFile.readParams(abstractSerializedData, z);
        }
        return tLRPC$EncryptedFile;
    }
}
