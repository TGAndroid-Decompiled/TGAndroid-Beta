package org.telegram.tgnet;
public class TLRPC$TL_channelParticipantsKicked extends TLRPC$ChannelParticipantsFilter {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.q = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1548400251);
        abstractSerializedData.writeString(this.q);
    }
}
