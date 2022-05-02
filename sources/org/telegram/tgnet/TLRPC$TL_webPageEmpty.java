package org.telegram.tgnet;

public class TLRPC$TL_webPageEmpty extends TLRPC$WebPage {
    public static int constructor = -350980120;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f983id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f983id);
    }
}
