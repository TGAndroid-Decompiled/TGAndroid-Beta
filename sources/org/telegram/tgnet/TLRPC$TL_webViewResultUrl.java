package org.telegram.tgnet;

public class TLRPC$TL_webViewResultUrl extends TLObject {
    public int flags;
    public boolean fullsize;
    public long query_id;
    public String url;

    public static TLRPC$TL_webViewResultUrl TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1294139288 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_webViewResultUrl", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_webViewResultUrl tLRPC$TL_webViewResultUrl = new TLRPC$TL_webViewResultUrl();
        tLRPC$TL_webViewResultUrl.readParams(abstractSerializedData, z);
        return tLRPC$TL_webViewResultUrl;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.fullsize = (readInt32 & 2) != 0;
        if ((readInt32 & 1) != 0) {
            this.query_id = abstractSerializedData.readInt64(z);
        }
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1294139288);
        int i = this.fullsize ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.query_id);
        }
        abstractSerializedData.writeString(this.url);
    }
}
