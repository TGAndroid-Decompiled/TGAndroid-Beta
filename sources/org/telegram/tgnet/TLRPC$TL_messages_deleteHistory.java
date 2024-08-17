package org.telegram.tgnet;

public class TLRPC$TL_messages_deleteHistory extends TLObject {
    public int flags;
    public boolean just_clear;
    public int max_date;
    public int max_id;
    public int min_date;
    public TLRPC$InputPeer peer;
    public boolean revoke;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_affectedHistory.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1332768214);
        int i = this.just_clear ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.revoke ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
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
