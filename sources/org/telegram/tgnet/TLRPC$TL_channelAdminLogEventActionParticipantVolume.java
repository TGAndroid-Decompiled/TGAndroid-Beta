package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionParticipantVolume extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$TL_groupCallParticipant participant;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.participant = TLRPC$TL_groupCallParticipant.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1048537159);
        this.participant.serializeToStream(abstractSerializedData);
    }
}
