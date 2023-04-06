package org.telegram.tgnet;
public class TLRPC$TL_channels_getParticipant extends TLObject {
    public static int constructor = -1599378234;
    public TLRPC$InputChannel channel;
    public TLRPC$InputPeer participant;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_channels_channelParticipant.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
        this.participant.serializeToStream(abstractSerializedData);
    }
}
