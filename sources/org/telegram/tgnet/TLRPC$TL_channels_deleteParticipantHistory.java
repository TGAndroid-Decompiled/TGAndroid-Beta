package org.telegram.tgnet;
public class TLRPC$TL_channels_deleteParticipantHistory extends TLObject {
    public TLRPC$InputChannel channel;
    public TLRPC$InputPeer participant;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_affectedHistory.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(913655003);
        this.channel.serializeToStream(abstractSerializedData);
        this.participant.serializeToStream(abstractSerializedData);
    }
}
