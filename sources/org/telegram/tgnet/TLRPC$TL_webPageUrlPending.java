package org.telegram.tgnet;

public class TLRPC$TL_webPageUrlPending extends TLRPC$WebPage {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-736472729);
        abstractSerializedData.writeString(this.url);
    }
}
