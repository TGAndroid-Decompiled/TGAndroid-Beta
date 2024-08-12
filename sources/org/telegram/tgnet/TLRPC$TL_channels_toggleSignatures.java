package org.telegram.tgnet;
public class TLRPC$TL_channels_toggleSignatures extends TLObject {
    public TLRPC$InputChannel channel;
    public int flags;
    public boolean profiles_enabled;
    public boolean signatures_enabled;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1099781276);
        int i = this.signatures_enabled ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.profiles_enabled ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.channel.serializeToStream(abstractSerializedData);
    }
}
