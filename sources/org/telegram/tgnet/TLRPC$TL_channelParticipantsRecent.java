package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantsRecent extends TLRPC$ChannelParticipantsFilter {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-566281095);
    }
}
