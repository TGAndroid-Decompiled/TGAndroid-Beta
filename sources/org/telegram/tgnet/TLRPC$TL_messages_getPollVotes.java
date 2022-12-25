package org.telegram.tgnet;

public class TLRPC$TL_messages_getPollVotes extends TLObject {
    public static int constructor = -1200736242;
    public int flags;
    public int f951id;
    public int limit;
    public String offset;
    public byte[] option;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_votesList.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.f951id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeByteArray(this.option);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.offset);
        }
        abstractSerializedData.writeInt32(this.limit);
    }
}
