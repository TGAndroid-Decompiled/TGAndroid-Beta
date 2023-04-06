package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionParticipantMute extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = -115071790;
    public TLRPC$TL_groupCallParticipant participant;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.participant = TLRPC$TL_groupCallParticipant.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.participant.serializeToStream(abstractSerializedData);
    }
}
