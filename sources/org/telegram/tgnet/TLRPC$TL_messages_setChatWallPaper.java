package org.telegram.tgnet;

public class TLRPC$TL_messages_setChatWallPaper extends TLObject {
    public int flags;
    public boolean for_both;
    public int id;
    public TLRPC$InputPeer peer;
    public boolean revert;
    public TLRPC$WallPaperSettings settings;
    public TLRPC$InputWallPaper wallpaper;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1879389471);
        int i = this.for_both ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        int i2 = this.revert ? i | 16 : i & (-17);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            this.wallpaper.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            this.settings.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.id);
        }
    }
}
