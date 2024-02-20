package org.telegram.tgnet;
public class TLRPC$TL_bankCardOpenUrl extends TLObject {
    public String name;
    public String url;

    public static TLRPC$TL_bankCardOpenUrl TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-177732982 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_bankCardOpenUrl", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_bankCardOpenUrl tLRPC$TL_bankCardOpenUrl = new TLRPC$TL_bankCardOpenUrl();
        tLRPC$TL_bankCardOpenUrl.readParams(abstractSerializedData, z);
        return tLRPC$TL_bankCardOpenUrl;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
        this.name = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-177732982);
        abstractSerializedData.writeString(this.url);
        abstractSerializedData.writeString(this.name);
    }
}
