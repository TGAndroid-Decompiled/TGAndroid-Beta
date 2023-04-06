package org.telegram.tgnet;
public class TLRPC$TL_channels_toggleUsername extends TLObject {
    public static int constructor = 1358053637;
    public boolean active;
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
        abstractSerializedData.writeBool(this.active);
    }
}
