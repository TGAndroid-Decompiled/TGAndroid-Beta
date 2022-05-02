package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionParticipantUnmute extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = -431740480;
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
