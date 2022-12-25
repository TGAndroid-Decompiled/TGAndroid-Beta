package org.telegram.tgnet;

public class TLRPC$TL_messages_updatePinnedMessage extends TLObject {
    public static int constructor = -760547348;
    public int flags;
    public int f958id;
    public TLRPC$InputPeer peer;
    public boolean pm_oneside;
    public boolean silent;
    public boolean unpin;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.silent ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.unpin ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.pm_oneside ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.f958id);
    }
}
