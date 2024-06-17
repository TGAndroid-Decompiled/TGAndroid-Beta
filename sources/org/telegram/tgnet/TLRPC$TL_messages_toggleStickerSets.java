package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_toggleStickerSets extends TLObject {
    public boolean archive;
    public int flags;
    public ArrayList<TLRPC$InputStickerSet> stickersets = new ArrayList<>();
    public boolean unarchive;
    public boolean uninstall;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1257951254);
        int i = this.uninstall ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.archive ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.unarchive ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        abstractSerializedData.writeInt32(481674261);
        int size = this.stickersets.size();
        abstractSerializedData.writeInt32(size);
        for (int i4 = 0; i4 < size; i4++) {
            this.stickersets.get(i4).serializeToStream(abstractSerializedData);
        }
    }
}
