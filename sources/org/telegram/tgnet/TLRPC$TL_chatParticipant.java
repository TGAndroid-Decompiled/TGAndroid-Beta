package org.telegram.tgnet;

public class TLRPC$TL_chatParticipant extends TLRPC$ChatParticipant {
    public static int constructor = -1070776313;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.inviter_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt64(this.inviter_id);
        abstractSerializedData.writeInt32(this.date);
    }
}
