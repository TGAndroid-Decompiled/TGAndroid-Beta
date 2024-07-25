package org.telegram.tgnet;
public class TLRPC$TL_simpleWebViewResultUrl extends TLObject {
    public String url;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2010155333);
        abstractSerializedData.writeString(this.url);
    }
}
