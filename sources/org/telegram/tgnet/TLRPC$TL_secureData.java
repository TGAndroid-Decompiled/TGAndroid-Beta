package org.telegram.tgnet;
public class TLRPC$TL_secureData extends TLObject {
    public static int constructor = -1964327229;
    public byte[] data;
    public byte[] data_hash;
    public byte[] secret;

    public static TLRPC$TL_secureData TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_secureData", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_secureData tLRPC$TL_secureData = new TLRPC$TL_secureData();
        tLRPC$TL_secureData.readParams(abstractSerializedData, z);
        return tLRPC$TL_secureData;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.data = abstractSerializedData.readByteArray(z);
        this.data_hash = abstractSerializedData.readByteArray(z);
        this.secret = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeByteArray(this.data);
        abstractSerializedData.writeByteArray(this.data_hash);
        abstractSerializedData.writeByteArray(this.secret);
    }
}
