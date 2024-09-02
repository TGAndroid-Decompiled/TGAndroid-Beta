package org.telegram.tgnet;

public class TLRPC$TL_photos_updateProfilePhoto extends TLObject {
    public TLRPC$InputUser bot;
    public boolean fallback;
    public int flags;
    public TLRPC$InputPhoto id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_photos_photo.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(166207545);
        int i = this.fallback ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 2) != 0) {
            this.bot.serializeToStream(abstractSerializedData);
        }
        this.id.serializeToStream(abstractSerializedData);
    }
}
