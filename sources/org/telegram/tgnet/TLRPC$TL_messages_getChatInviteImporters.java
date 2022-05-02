package org.telegram.tgnet;

public class TLRPC$TL_messages_getChatInviteImporters extends TLObject {
    public static int constructor = -553329330;
    public int flags;
    public int limit;
    public String link;
    public int offset_date;
    public TLRPC$InputUser offset_user;
    public TLRPC$InputPeer peer;
    public String f935q;
    public boolean requested;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_chatInviteImporters.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.requested ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.link);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.f935q);
        }
        abstractSerializedData.writeInt32(this.offset_date);
        this.offset_user.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.limit);
    }
}
