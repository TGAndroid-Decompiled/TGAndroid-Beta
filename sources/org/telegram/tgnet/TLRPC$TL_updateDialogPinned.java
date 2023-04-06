package org.telegram.tgnet;
public class TLRPC$TL_updateDialogPinned extends TLRPC$Update {
    public static int constructor = 1852826908;
    public int flags;
    public int folder_id;
    public TLRPC$DialogPeer peer;
    public boolean pinned;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.pinned = (readInt32 & 1) != 0;
        if ((readInt32 & 2) != 0) {
            this.folder_id = abstractSerializedData.readInt32(z);
        }
        this.peer = TLRPC$DialogPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.pinned ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.folder_id);
        }
        this.peer.serializeToStream(abstractSerializedData);
    }
}
