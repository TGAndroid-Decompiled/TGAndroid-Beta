package org.telegram.tgnet;
public class TLRPC$TL_channels_updateUsername extends TLObject {
    public static int constructor = 890549214;
    public TLRPC$InputChannel channel;
    public String username;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.username);
    }
}
