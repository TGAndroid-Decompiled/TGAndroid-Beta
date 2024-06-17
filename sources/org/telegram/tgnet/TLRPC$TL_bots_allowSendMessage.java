package org.telegram.tgnet;

public class TLRPC$TL_bots_allowSendMessage extends TLObject {
    public TLRPC$InputUser bot;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-248323089);
        this.bot.serializeToStream(abstractSerializedData);
    }
}
