package org.telegram.tgnet;

public class TLRPC$TL_messages_requestSimpleWebView extends TLObject {
    public TLRPC$InputUser bot;
    public boolean compact;
    public int flags;
    public boolean from_side_menu;
    public boolean from_switch_webview;
    public String platform;
    public String start_param;
    public TLRPC$TL_dataJSON theme_params;
    public String url;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_webViewResultUrl.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1094336115);
        int i = this.from_switch_webview ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.from_side_menu ? i | 4 : i & (-5);
        this.flags = i2;
        int i3 = this.compact ? i2 | 128 : i2 & (-129);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        this.bot.serializeToStream(abstractSerializedData);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.url);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeString(this.start_param);
        }
        if ((this.flags & 1) != 0) {
            this.theme_params.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.platform);
    }
}
