package org.telegram.tgnet;

public class TLRPC$TL_account_updatePersonalChannel extends TLObject {
    public TLRPC$InputChannel channel;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-649919008);
        this.channel.serializeToStream(abstractSerializedData);
    }
}
