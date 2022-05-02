package org.telegram.tgnet;

public class TLRPC$TL_pageBlockChannel extends TLRPC$PageBlock {
    public static int constructor = -283684427;
    public TLRPC$Chat channel;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel = TLRPC$Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
    }
}
