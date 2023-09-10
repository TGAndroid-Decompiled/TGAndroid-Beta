package org.telegram.tgnet;
public class TLRPC$TL_bots_allowSendMessage extends TLObject {
    public static int constructor = -248323089;
    public TLRPC$InputUser bot;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.bot.serializeToStream(abstractSerializedData);
    }
}
