package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_sendQuickReplyMessages extends TLObject {
    public TLRPC$InputPeer peer;
    public int shortcut_id;
    public ArrayList id = new ArrayList();
    public ArrayList random_id = new ArrayList();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1819610593);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.shortcut_id);
        abstractSerializedData.writeInt32(481674261);
        int size = this.id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(((Integer) this.id.get(i)).intValue());
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.random_id.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            abstractSerializedData.writeInt64(((Long) this.random_id.get(i2)).longValue());
        }
    }
}
