package org.telegram.tgnet;
public class TLRPC$TL_channels_editCreator extends TLObject {
    public TLRPC$InputChannel channel;
    public TLRPC$InputCheckPasswordSRP password;
    public TLRPC$InputUser user_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1892102881);
        this.channel.serializeToStream(abstractSerializedData);
        this.user_id.serializeToStream(abstractSerializedData);
        this.password.serializeToStream(abstractSerializedData);
    }
}
