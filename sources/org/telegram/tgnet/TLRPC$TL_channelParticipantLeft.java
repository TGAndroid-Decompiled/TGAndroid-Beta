package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantLeft extends TLRPC$ChannelParticipant {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(453242886);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
