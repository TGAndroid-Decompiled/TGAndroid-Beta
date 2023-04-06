package org.telegram.tgnet;
public class TLRPC$TL_secureFile extends TLRPC$SecureFile {
    public static int constructor = 2097791614;
    public long access_hash;
    public int date;
    public int dc_id;
    public byte[] file_hash;
    public long id;
    public byte[] secret;
    public long size;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.size = abstractSerializedData.readInt64(z);
        this.dc_id = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
        this.file_hash = abstractSerializedData.readByteArray(z);
        this.secret = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeInt64(this.size);
        abstractSerializedData.writeInt32(this.dc_id);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeByteArray(this.file_hash);
        abstractSerializedData.writeByteArray(this.secret);
    }
}
