package org.telegram.tgnet;
public class TLRPC$TL_inputNotifyForumTopic extends TLRPC$InputNotifyPeer {
    public TLRPC$InputPeer peer;
    public int top_msg_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.top_msg_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1548122514);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.top_msg_id);
    }
}
