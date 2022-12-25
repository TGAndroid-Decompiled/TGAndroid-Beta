package org.telegram.tgnet;

public class TLRPC$TL_updateDialogUnreadMark extends TLRPC$Update {
    public static int constructor = -513517117;
    public int flags;
    public TLRPC$DialogPeer peer;
    public boolean unread;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.unread = (readInt32 & 1) != 0;
        this.peer = TLRPC$DialogPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.unread ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
