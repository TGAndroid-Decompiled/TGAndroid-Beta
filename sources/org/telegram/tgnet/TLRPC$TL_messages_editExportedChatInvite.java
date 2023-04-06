package org.telegram.tgnet;
public class TLRPC$TL_messages_editExportedChatInvite extends TLObject {
    public static int constructor = -1110823051;
    public int expire_date;
    public int flags;
    public String link;
    public TLRPC$InputPeer peer;
    public boolean request_needed;
    public boolean revoked;
    public String title;
    public int usage_limit;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_ExportedChatInvite.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.revoked ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.link);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.expire_date);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.usage_limit);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeBool(this.request_needed);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeString(this.title);
        }
    }
}
