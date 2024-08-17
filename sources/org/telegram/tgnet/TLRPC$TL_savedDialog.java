package org.telegram.tgnet;

public class TLRPC$TL_savedDialog extends TLObject {
    public int flags;
    public TLRPC$Peer peer;
    public boolean pinned;
    public int top_message;

    public static TLRPC$TL_savedDialog TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1115174036 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_savedDialog", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_savedDialog tLRPC$TL_savedDialog = new TLRPC$TL_savedDialog();
        tLRPC$TL_savedDialog.readParams(abstractSerializedData, z);
        return tLRPC$TL_savedDialog;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.pinned = (readInt32 & 4) != 0;
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.top_message = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1115174036);
        int i = this.pinned ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.top_message);
    }
}
