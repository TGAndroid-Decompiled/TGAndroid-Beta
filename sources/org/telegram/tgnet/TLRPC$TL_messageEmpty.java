package org.telegram.tgnet;
public class TLRPC$TL_messageEmpty extends TLRPC$Message {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.id = abstractSerializedData.readInt32(z);
        this.peer_id = (this.flags & 1) != 0 ? TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z) : new TLRPC$TL_peerUser();
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1868117372);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & 1) != 0) {
            this.peer_id.serializeToStream(abstractSerializedData);
        }
    }
}
