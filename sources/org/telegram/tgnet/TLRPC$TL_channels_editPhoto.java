package org.telegram.tgnet;

public class TLRPC$TL_channels_editPhoto extends TLObject {
    public static int constructor = -248621111;
    public TLRPC$InputChannel channel;
    public TLRPC$InputChatPhoto photo;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
        this.photo.serializeToStream(abstractSerializedData);
    }
}
