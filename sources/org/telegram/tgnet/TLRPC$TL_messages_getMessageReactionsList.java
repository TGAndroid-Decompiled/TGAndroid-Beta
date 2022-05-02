package org.telegram.tgnet;

public class TLRPC$TL_messages_getMessageReactionsList extends TLObject {
    public static int constructor = -521245833;
    public int flags;
    public int f938id;
    public int limit;
    public String offset;
    public TLRPC$InputPeer peer;
    public String reaction;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_messageReactionsList.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.f938id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.reaction);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.offset);
        }
        abstractSerializedData.writeInt32(this.limit);
    }
}
