package org.telegram.tgnet;
public class TLRPC$TL_messages_getExportedChatInvites extends TLObject {
    public static int constructor = -1565154314;
    public TLRPC$InputUser admin_id;
    public int flags;
    public int limit;
    public int offset_date;
    public String offset_link;
    public TLRPC$InputPeer peer;
    public boolean revoked;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_exportedChatInvites.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.revoked ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        this.admin_id.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.offset_date);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.offset_link);
        }
        abstractSerializedData.writeInt32(this.limit);
    }
}
