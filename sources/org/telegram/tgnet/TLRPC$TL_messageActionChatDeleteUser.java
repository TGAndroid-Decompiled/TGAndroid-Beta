package org.telegram.tgnet;

public class TLRPC$TL_messageActionChatDeleteUser extends TLRPC$MessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1539362612);
        abstractSerializedData.writeInt64(this.user_id);
    }
}
