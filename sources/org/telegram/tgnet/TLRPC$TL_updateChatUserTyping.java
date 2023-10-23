package org.telegram.tgnet;
public class TLRPC$TL_updateChatUserTyping extends TLRPC$Update {
    public TLRPC$SendMessageAction action;
    public long chat_id;
    public TLRPC$Peer from_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat_id = abstractSerializedData.readInt64(z);
        this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.action = TLRPC$SendMessageAction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2092401936);
        abstractSerializedData.writeInt64(this.chat_id);
        this.from_id.serializeToStream(abstractSerializedData);
        this.action.serializeToStream(abstractSerializedData);
    }
}
