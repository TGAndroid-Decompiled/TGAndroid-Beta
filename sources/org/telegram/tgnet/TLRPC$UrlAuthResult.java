package org.telegram.tgnet;

public abstract class TLRPC$UrlAuthResult extends TLObject {
    public static TLRPC$UrlAuthResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$UrlAuthResult tLRPC$TL_urlAuthResultRequest = i != -1886646706 ? i != -1831650802 ? i != -1445536993 ? null : new TLRPC$UrlAuthResult() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1445536993);
            }
        } : new TLRPC$TL_urlAuthResultRequest() : new TLRPC$TL_urlAuthResultAccepted();
        if (tLRPC$TL_urlAuthResultRequest == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in UrlAuthResult", Integer.valueOf(i)));
        }
        if (tLRPC$TL_urlAuthResultRequest != null) {
            tLRPC$TL_urlAuthResultRequest.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_urlAuthResultRequest;
    }
}
