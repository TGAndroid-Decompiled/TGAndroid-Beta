package org.telegram.tgnet;
public class TLRPC$TL_messages_getAttachMenuBot extends TLObject {
    public static int constructor = 1998676370;
    public TLRPC$InputUser bot;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_attachMenuBotsBot.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.bot.serializeToStream(abstractSerializedData);
    }
}
