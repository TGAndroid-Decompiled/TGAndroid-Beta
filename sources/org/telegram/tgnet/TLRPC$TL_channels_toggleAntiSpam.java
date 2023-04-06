package org.telegram.tgnet;
public class TLRPC$TL_channels_toggleAntiSpam extends TLObject {
    public static int constructor = 1760814315;
    public TLRPC$InputChannel channel;
    public boolean enabled;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.enabled);
    }
}
