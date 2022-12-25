package org.telegram.tgnet;

public class TLRPC$TL_inputTheme extends TLRPC$InputTheme {
    public static int constructor = 1012306921;
    public long access_hash;
    public long f928id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f928id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f928id);
        abstractSerializedData.writeInt64(this.access_hash);
    }
}
