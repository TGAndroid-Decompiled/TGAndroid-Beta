package org.telegram.tgnet;

public class TLRPC$TL_channels_clickSponsoredMessage extends TLObject {
    public TLRPC$InputChannel channel;
    public int flags;
    public boolean fullscreen;
    public boolean media;
    public byte[] random_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(21257589);
        int i = this.media ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.fullscreen ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeByteArray(this.random_id);
    }
}
