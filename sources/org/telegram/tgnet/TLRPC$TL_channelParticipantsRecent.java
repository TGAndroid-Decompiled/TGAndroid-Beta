package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantsRecent extends TLRPC$ChannelParticipantsFilter {
    public static int constructor = -566281095;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
