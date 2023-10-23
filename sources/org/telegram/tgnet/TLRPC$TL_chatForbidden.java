package org.telegram.tgnet;
public class TLRPC$TL_chatForbidden extends TLRPC$Chat {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.title = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1704108455);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeString(this.title);
    }
}
