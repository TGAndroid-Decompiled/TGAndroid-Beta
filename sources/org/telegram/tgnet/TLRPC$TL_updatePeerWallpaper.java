package org.telegram.tgnet;

public class TLRPC$TL_updatePeerWallpaper extends TLRPC$Update {
    public int flags;
    public TLRPC$Peer peer;
    public TLRPC$WallPaper wallpaper;
    public boolean wallpaper_overridden;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.wallpaper_overridden = (readInt32 & 2) != 0;
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1371598819);
        int i = this.wallpaper_overridden ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            this.wallpaper.serializeToStream(abstractSerializedData);
        }
    }
}
