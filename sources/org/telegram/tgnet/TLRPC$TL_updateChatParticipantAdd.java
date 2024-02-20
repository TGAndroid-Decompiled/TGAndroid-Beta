package org.telegram.tgnet;
public class TLRPC$TL_updateChatParticipantAdd extends TLRPC$Update {
    public long chat_id;
    public int date;
    public long inviter_id;
    public long user_id;
    public int version;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat_id = abstractSerializedData.readInt64(z);
        this.user_id = abstractSerializedData.readInt64(z);
        this.inviter_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        this.version = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1037718609);
        abstractSerializedData.writeInt64(this.chat_id);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt64(this.inviter_id);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.version);
    }
}
