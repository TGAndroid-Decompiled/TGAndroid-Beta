package org.telegram.tgnet;

public class TLRPC$TL_messages_requestAppWebView extends TLObject {
    public TLRPC$InputBotApp app;
    public boolean compact;
    public int flags;
    public TLRPC$InputPeer peer;
    public String platform;
    public String start_param;
    public TLRPC$TL_dataJSON theme_params;
    public boolean write_allowed;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_webViewResultUrl.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1398901710);
        int i = this.write_allowed ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.compact ? i | 128 : i & (-129);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.peer.serializeToStream(abstractSerializedData);
        this.app.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.start_param);
        }
        if ((this.flags & 4) != 0) {
            this.theme_params.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.platform);
    }
}
