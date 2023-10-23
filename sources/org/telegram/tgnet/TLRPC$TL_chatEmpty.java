package org.telegram.tgnet;
public class TLRPC$TL_chatEmpty extends TLRPC$Chat {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.title = "DELETED";
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(693512293);
        abstractSerializedData.writeInt64(this.id);
    }
}
