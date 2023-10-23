package org.telegram.tgnet;
public class TLRPC$TL_messages_sendBotRequestedPeer extends TLObject {
    public int button_id;
    public int msg_id;
    public TLRPC$InputPeer peer;
    public TLRPC$InputPeer requested_peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-29831141);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.msg_id);
        abstractSerializedData.writeInt32(this.button_id);
        this.requested_peer.serializeToStream(abstractSerializedData);
    }
}
