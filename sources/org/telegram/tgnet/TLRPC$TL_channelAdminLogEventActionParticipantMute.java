package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionParticipantMute extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$TL_groupCallParticipant participant;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.participant = TLRPC$TL_groupCallParticipant.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-115071790);
        this.participant.serializeToStream(abstractSerializedData);
    }
}
