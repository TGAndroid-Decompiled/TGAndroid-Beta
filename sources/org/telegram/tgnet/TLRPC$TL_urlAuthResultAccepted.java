package org.telegram.tgnet;

public class TLRPC$TL_urlAuthResultAccepted extends TLRPC$UrlAuthResult {
    public String url;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1886646706);
        abstractSerializedData.writeString(this.url);
    }
}
