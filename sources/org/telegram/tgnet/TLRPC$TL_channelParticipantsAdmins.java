package org.telegram.tgnet;
public class TLRPC$TL_channelParticipantsAdmins extends TLRPC$ChannelParticipantsFilter {
    public static int constructor = -1268741783;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
