package org.telegram.tgnet;

public class TLRPC$TL_messageReactor extends TLRPC$MessageReactor {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.top = (readInt32 & 1) != 0;
        this.my = (readInt32 & 2) != 0;
        this.anonymous = (readInt32 & 4) != 0;
        if ((readInt32 & 8) != 0) {
            this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1269016922);
        int i = this.top ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.my ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.anonymous ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        if ((this.flags & 8) != 0) {
            this.peer_id.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.count);
    }
}
