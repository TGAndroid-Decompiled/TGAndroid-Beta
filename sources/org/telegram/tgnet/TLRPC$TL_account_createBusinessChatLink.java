package org.telegram.tgnet;

public class TLRPC$TL_account_createBusinessChatLink extends TLObject {
    public TLRPC$TL_inputBusinessChatLink link;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_businessChatLink.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2007898482);
        this.link.serializeToStream(abstractSerializedData);
    }
}
