package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionParticipantInvite extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = -484690728;
    public TLRPC$ChannelParticipant participant;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.participant = TLRPC$ChannelParticipant.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.participant.serializeToStream(abstractSerializedData);
    }
}
