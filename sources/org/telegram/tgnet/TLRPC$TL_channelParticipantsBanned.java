package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantsBanned extends TLRPC$ChannelParticipantsFilter {
    public static int constructor = 338142689;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f847q = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.f847q);
    }
}
