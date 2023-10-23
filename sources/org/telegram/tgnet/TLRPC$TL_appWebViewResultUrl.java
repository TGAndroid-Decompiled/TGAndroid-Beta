package org.telegram.tgnet;
public class TLRPC$TL_appWebViewResultUrl extends TLObject {
    public String url;

    public static TLRPC$TL_appWebViewResultUrl TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1008422669 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_appWebViewResultUrl", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_appWebViewResultUrl tLRPC$TL_appWebViewResultUrl = new TLRPC$TL_appWebViewResultUrl();
        tLRPC$TL_appWebViewResultUrl.readParams(abstractSerializedData, z);
        return tLRPC$TL_appWebViewResultUrl;
    }

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
