package org.telegram.tgnet;
public class TLRPC$TL_messages_setTyping extends TLObject {
    public static int constructor = 1486110434;
    public TLRPC$SendMessageAction action;
    public int flags;
    public TLRPC$InputPeer peer;
    public int top_msg_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
        }
        this.action.serializeToStream(abstractSerializedData);
    }
}
