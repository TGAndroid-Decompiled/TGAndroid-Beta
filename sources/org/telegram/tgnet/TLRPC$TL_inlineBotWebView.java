package org.telegram.tgnet;
public class TLRPC$TL_inlineBotWebView extends TLObject {
    public static int constructor = -1250781739;
    public String text;
    public String url;

    public static TLRPC$TL_inlineBotWebView TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_inlineBotWebView", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_inlineBotWebView tLRPC$TL_inlineBotWebView = new TLRPC$TL_inlineBotWebView();
        tLRPC$TL_inlineBotWebView.readParams(abstractSerializedData, z);
        return tLRPC$TL_inlineBotWebView;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.text);
        abstractSerializedData.writeString(this.url);
    }
}
