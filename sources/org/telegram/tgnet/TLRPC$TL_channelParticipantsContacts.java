package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantsContacts extends TLRPC$ChannelParticipantsFilter {
    public static int constructor = -1150621555;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f853q = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.f853q);
    }
}
