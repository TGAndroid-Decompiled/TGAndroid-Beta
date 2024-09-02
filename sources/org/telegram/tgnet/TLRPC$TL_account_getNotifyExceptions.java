package org.telegram.tgnet;

public class TLRPC$TL_account_getNotifyExceptions extends TLObject {
    public boolean compare_sound;
    public int flags;
    public TLRPC$InputNotifyPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1398240377);
        int i = this.compare_sound ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 1) != 0) {
            this.peer.serializeToStream(abstractSerializedData);
        }
    }
}
