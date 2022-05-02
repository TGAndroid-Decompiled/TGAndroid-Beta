package org.telegram.tgnet;

public class TLRPC$TL_messageActionChatMigrateTo extends TLRPC$MessageAction {
    public static int constructor = -519864430;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.channel_id);
    }
}
