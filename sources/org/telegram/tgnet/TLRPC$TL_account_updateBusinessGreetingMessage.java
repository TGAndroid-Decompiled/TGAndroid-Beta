package org.telegram.tgnet;

public class TLRPC$TL_account_updateBusinessGreetingMessage extends TLObject {
    public int flags;
    public TLRPC$TL_inputBusinessGreetingMessage message;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1724755908);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            this.message.serializeToStream(abstractSerializedData);
        }
    }
}
