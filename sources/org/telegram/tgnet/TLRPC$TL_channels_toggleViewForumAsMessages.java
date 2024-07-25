package org.telegram.tgnet;
public class TLRPC$TL_channels_toggleViewForumAsMessages extends TLObject {
    public static int constructor = -1757889771;
    public TLRPC$InputChannel channel_id;
    public boolean enabled;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.enabled);
    }
}
