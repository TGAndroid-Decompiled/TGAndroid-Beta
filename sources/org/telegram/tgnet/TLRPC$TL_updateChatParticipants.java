package org.telegram.tgnet;
public class TLRPC$TL_updateChatParticipants extends TLRPC$Update {
    public TLRPC$ChatParticipants participants;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(125178264);
        this.participants.serializeToStream(abstractSerializedData);
    }
}
