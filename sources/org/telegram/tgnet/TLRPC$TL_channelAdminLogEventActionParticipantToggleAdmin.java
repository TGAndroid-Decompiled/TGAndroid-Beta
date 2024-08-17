package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$ChannelParticipant new_participant;
    public TLRPC$ChannelParticipant prev_participant;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.prev_participant = TLRPC$ChannelParticipant.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_participant = TLRPC$ChannelParticipant.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-714643696);
        this.prev_participant.serializeToStream(abstractSerializedData);
        this.new_participant.serializeToStream(abstractSerializedData);
    }
}
