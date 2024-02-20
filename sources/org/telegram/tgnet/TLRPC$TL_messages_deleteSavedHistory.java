package org.telegram.tgnet;
public class TLRPC$TL_messages_deleteSavedHistory extends TLObject {
    public int flags;
    public int max_date;
    public int max_id;
    public int min_date;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_affectedHistory.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1855459371);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.max_id);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.min_date);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(this.max_date);
        }
    }
}
