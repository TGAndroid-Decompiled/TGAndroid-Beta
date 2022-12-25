package org.telegram.tgnet;

public class TLRPC$TL_messages_search extends TLObject {
    public static int constructor = -1593989278;
    public int add_offset;
    public TLRPC$MessagesFilter filter;
    public int flags;
    public TLRPC$InputPeer from_id;
    public long hash;
    public int limit;
    public int max_date;
    public int max_id;
    public int min_date;
    public int min_id;
    public int offset_id;
    public TLRPC$InputPeer peer;
    public String f952q;
    public int top_msg_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_Messages.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.f952q);
        if ((this.flags & 1) != 0) {
            this.from_id.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
        }
        this.filter.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.min_date);
        abstractSerializedData.writeInt32(this.max_date);
        abstractSerializedData.writeInt32(this.offset_id);
        abstractSerializedData.writeInt32(this.add_offset);
        abstractSerializedData.writeInt32(this.limit);
        abstractSerializedData.writeInt32(this.max_id);
        abstractSerializedData.writeInt32(this.min_id);
        abstractSerializedData.writeInt64(this.hash);
    }
}
