package org.telegram.tgnet;
public class TLRPC$TL_messages_readDiscussion extends TLObject {
    public int msg_id;
    public TLRPC$InputPeer peer;
    public int read_max_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-147740172);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.msg_id);
        abstractSerializedData.writeInt32(this.read_max_id);
    }
}
