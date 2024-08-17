package org.telegram.tgnet;

public class TLRPC$TL_pageBlockChannel extends TLRPC$PageBlock {
    public TLRPC$Chat channel;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel = TLRPC$Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-283684427);
        this.channel.serializeToStream(abstractSerializedData);
    }
}
