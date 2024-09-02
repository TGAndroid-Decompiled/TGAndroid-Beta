package org.telegram.tgnet;

public class TLRPC$TL_channels_editPhoto extends TLObject {
    public TLRPC$InputChannel channel;
    public TLRPC$InputChatPhoto photo;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-248621111);
        this.channel.serializeToStream(abstractSerializedData);
        this.photo.serializeToStream(abstractSerializedData);
    }
}
