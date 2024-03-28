package org.telegram.tgnet;
public class TLRPC$TL_messages_addChatUser extends TLObject {
    public long chat_id;
    public int fwd_limit;
    public TLRPC$InputUser user_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_invitedUsers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-230206493);
        abstractSerializedData.writeInt64(this.chat_id);
        this.user_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.fwd_limit);
    }
}
