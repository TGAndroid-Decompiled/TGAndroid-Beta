package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_sendVote extends TLObject {
    public int msg_id;
    public ArrayList options = new ArrayList();
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(283795844);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.msg_id);
        abstractSerializedData.writeInt32(481674261);
        int size = this.options.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeByteArray((byte[]) this.options.get(i));
        }
    }
}
