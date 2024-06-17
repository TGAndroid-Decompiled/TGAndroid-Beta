package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantsSearch extends TLRPC$ChannelParticipantsFilter {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.q = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(106343499);
        abstractSerializedData.writeString(this.q);
    }
}
