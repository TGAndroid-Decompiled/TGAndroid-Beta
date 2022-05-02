package org.telegram.tgnet;

public class TLRPC$TL_fileHash extends TLObject {
    public static int constructor = 1648543603;
    public byte[] hash;
    public int limit;
    public int offset;

    public static TLRPC$TL_fileHash TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_fileHash tLRPC$TL_fileHash = new TLRPC$TL_fileHash();
            tLRPC$TL_fileHash.readParams(abstractSerializedData, z);
            return tLRPC$TL_fileHash;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_fileHash", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.offset = abstractSerializedData.readInt32(z);
        this.limit = abstractSerializedData.readInt32(z);
        this.hash = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.offset);
        abstractSerializedData.writeInt32(this.limit);
        abstractSerializedData.writeByteArray(this.hash);
    }
}
