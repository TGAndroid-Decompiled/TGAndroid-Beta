package org.telegram.tgnet;

public class TLRPC$TL_messageEmpty extends TLRPC$Message {
    public static int constructor = -1868117372;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.f881id = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        } else {
            this.peer_id = new TLRPC$TL_peerUser();
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.f881id);
        if ((this.flags & 1) != 0) {
            this.peer_id.serializeToStream(abstractSerializedData);
        }
    }
}
