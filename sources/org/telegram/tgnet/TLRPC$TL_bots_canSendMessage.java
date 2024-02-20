package org.telegram.tgnet;
public class TLRPC$TL_bots_canSendMessage extends TLObject {
    public TLRPC$InputUser bot;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(324662502);
        this.bot.serializeToStream(abstractSerializedData);
    }
}
