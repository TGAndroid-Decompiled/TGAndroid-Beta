package org.telegram.tgnet;

public class TLRPC$TL_phone_groupCallStreamRtmpUrl extends TLObject {
    public String key;
    public String url;

    public static TLRPC$TL_phone_groupCallStreamRtmpUrl TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (767505458 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_phone_groupCallStreamRtmpUrl", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_phone_groupCallStreamRtmpUrl tLRPC$TL_phone_groupCallStreamRtmpUrl = new TLRPC$TL_phone_groupCallStreamRtmpUrl();
        tLRPC$TL_phone_groupCallStreamRtmpUrl.readParams(abstractSerializedData, z);
        return tLRPC$TL_phone_groupCallStreamRtmpUrl;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
        this.key = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(767505458);
        abstractSerializedData.writeString(this.url);
        abstractSerializedData.writeString(this.key);
    }
}
