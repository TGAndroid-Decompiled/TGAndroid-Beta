package org.telegram.tgnet;
public class TLRPC$TL_appWebViewResultUrl extends TLObject {
    public String url;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1008422669);
        abstractSerializedData.writeString(this.url);
    }
}
