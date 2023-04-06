package org.telegram.tgnet;
public class TLRPC$TL_messageActionChatJoinedByLink extends TLRPC$MessageAction {
    public static int constructor = 51520707;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.inviter_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.inviter_id);
    }
}
