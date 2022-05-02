package org.telegram.tgnet;

public class TLRPC$TL_messages_requestSimpleWebView extends TLObject {
    public static int constructor = 1790652275;
    public TLRPC$InputUser bot;
    public int flags;
    public TLRPC$TL_dataJSON theme_params;
    public String url;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_simpleWebViewResultUrl.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.bot.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.url);
        if ((this.flags & 1) != 0) {
            this.theme_params.serializeToStream(abstractSerializedData);
        }
    }
}
