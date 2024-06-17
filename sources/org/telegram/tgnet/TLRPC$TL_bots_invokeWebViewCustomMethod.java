package org.telegram.tgnet;

public class TLRPC$TL_bots_invokeWebViewCustomMethod extends TLObject {
    public TLRPC$InputUser bot;
    public String custom_method;
    public TLRPC$TL_dataJSON params;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_dataJSON.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(142591463);
        this.bot.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.custom_method);
        this.params.serializeToStream(abstractSerializedData);
    }
}
