package org.telegram.tgnet;

public class TLRPC$TL_messages_toggleDialogPin extends TLObject {
    public int flags;
    public TLRPC$InputDialogPeer peer;
    public boolean pinned;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1489903017);
        int i = this.pinned ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
