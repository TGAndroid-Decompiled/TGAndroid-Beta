package org.telegram.tgnet;

public class TLRPC$TL_webPagePending extends TLRPC$WebPage {
    public static int constructor = -981018084;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f983id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f983id);
        abstractSerializedData.writeInt32(this.date);
    }
}
