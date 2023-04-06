package org.telegram.tgnet;
public class TLRPC$TL_messages_acceptUrlAuth extends TLObject {
    public static int constructor = -1322487515;
    public int button_id;
    public int flags;
    public int msg_id;
    public TLRPC$InputPeer peer;
    public String url;
    public boolean write_allowed;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$UrlAuthResult.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.write_allowed ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 2) != 0) {
            this.peer.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.msg_id);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.button_id);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.url);
        }
    }
}
