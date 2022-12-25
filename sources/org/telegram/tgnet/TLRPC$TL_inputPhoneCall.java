package org.telegram.tgnet;

public class TLRPC$TL_inputPhoneCall extends TLObject {
    public static int constructor = 506920429;
    public long access_hash;
    public long f923id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f923id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f923id);
        abstractSerializedData.writeInt64(this.access_hash);
    }
}
