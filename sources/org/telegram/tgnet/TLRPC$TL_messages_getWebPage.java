package org.telegram.tgnet;
public class TLRPC$TL_messages_getWebPage extends TLObject {
    public static int constructor = 852135825;
    public int hash;
    public String url;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_webPage.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.url);
        abstractSerializedData.writeInt32(this.hash);
    }
}
