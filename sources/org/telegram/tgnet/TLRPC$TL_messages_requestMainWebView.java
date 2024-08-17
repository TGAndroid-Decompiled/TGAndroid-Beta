package org.telegram.tgnet;

public class TLRPC$TL_messages_requestMainWebView extends TLObject {
    public TLRPC$InputUser bot;
    public boolean compact;
    public int flags;
    public TLRPC$InputPeer peer;
    public String platform;
    public String start_param;
    public TLRPC$TL_dataJSON theme_params;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_webViewResultUrl.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-908059013);
        int i = this.compact ? this.flags | 128 : this.flags & (-129);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        this.bot.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.start_param);
        }
        if ((this.flags & 1) != 0) {
            this.theme_params.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.platform);
    }
}
