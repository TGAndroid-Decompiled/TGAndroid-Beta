package org.telegram.tgnet;
public class TLRPC$MessageReactor extends TLObject {
    public boolean anonymous;
    public int count;
    public int flags;
    public boolean my;
    public TLRPC$Peer peer_id;
    public boolean top;

    public static TLRPC$MessageReactor TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_messageReactor tLRPC$TL_messageReactor;
        if (i != -285158328) {
            tLRPC$TL_messageReactor = i != 1269016922 ? null : new TLRPC$TL_messageReactor();
        } else {
            tLRPC$TL_messageReactor = new TLRPC$TL_messageReactor() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.top = (readInt32 & 1) != 0;
                    this.my = (readInt32 & 2) != 0;
                    this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.count = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-285158328);
                    int i2 = this.top ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    int i3 = this.my ? i2 | 2 : i2 & (-3);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    this.peer_id.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(this.count);
                }
            };
        }
        if (tLRPC$TL_messageReactor == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessageReactor", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messageReactor != null) {
            tLRPC$TL_messageReactor.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messageReactor;
    }
}
