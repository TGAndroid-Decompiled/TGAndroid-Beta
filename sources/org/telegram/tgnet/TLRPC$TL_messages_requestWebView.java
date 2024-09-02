package org.telegram.tgnet;

public class TLRPC$TL_messages_requestWebView extends TLObject {
    public TLRPC$InputUser bot;
    public boolean compact;
    public int flags;
    public boolean from_bot_menu;
    public TLRPC$InputPeer peer;
    public String platform;
    public TLRPC$InputReplyTo reply_to;
    public TLRPC$InputPeer send_as;
    public boolean silent;
    public String start_param;
    public TLRPC$TL_dataJSON theme_params;
    public String url;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_webViewResultUrl.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(647873217);
        int i = this.from_bot_menu ? this.flags | 16 : this.flags & (-17);
        this.flags = i;
        int i2 = this.silent ? i | 32 : i & (-33);
        this.flags = i2;
        int i3 = this.compact ? i2 | 128 : i2 & (-129);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        this.peer.serializeToStream(abstractSerializedData);
        this.bot.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.url);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.start_param);
        }
        if ((this.flags & 4) != 0) {
            this.theme_params.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.platform);
        if ((this.flags & 1) != 0) {
            this.reply_to.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8192) != 0) {
            this.send_as.serializeToStream(abstractSerializedData);
        }
    }
}
