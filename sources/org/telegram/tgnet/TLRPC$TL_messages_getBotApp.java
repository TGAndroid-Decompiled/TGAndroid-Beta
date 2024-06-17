package org.telegram.tgnet;

public class TLRPC$TL_messages_getBotApp extends TLObject {
    public TLRPC$InputBotApp app;
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_botApp.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(889046467);
        this.app.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.hash);
    }
}
