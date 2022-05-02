package org.telegram.tgnet;

public class TLRPC$TL_channelParticipant extends TLRPC$ChannelParticipant {
    public static int constructor = -1072953408;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        this.peer = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.peer.user_id);
        abstractSerializedData.writeInt32(this.date);
    }
}
