package org.telegram.tgnet;

public class TLRPC$TL_webPageEmpty extends TLRPC$WebPage {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.id = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.url = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(555358088);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.url);
        }
    }
}
