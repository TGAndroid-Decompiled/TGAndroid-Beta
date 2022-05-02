package org.telegram.tgnet;

public class TLRPC$TL_chatForbidden extends TLRPC$Chat {
    public static int constructor = 1704108455;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f854id = abstractSerializedData.readInt64(z);
        this.title = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f854id);
        abstractSerializedData.writeString(this.title);
    }
}
