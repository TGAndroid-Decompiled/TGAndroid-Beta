package org.telegram.tgnet;

public class TLRPC$TL_channelParticipant extends TLRPC$ChannelParticipant {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        this.peer = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.subscription_until_date = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-885426663);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.peer.user_id);
        abstractSerializedData.writeInt32(this.date);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.subscription_until_date);
        }
    }
}
