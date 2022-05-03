package org.telegram.tgnet;

public class TLRPC$TL_channels_exportMessageLink extends TLObject {
    public static int constructor = -432034325;
    public TLRPC$InputChannel channel;
    public int flags;
    public boolean grouped;
    public int id;
    public boolean thread;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_exportedMessageLink.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.grouped ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.thread ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.id);
    }
}
