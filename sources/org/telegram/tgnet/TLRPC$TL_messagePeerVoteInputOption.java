package org.telegram.tgnet;
public class TLRPC$TL_messagePeerVoteInputOption extends TLRPC$MessagePeerVote {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1959634180);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.date);
    }
}
