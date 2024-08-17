package org.telegram.tgnet;

public class TLRPC$TL_updateNewQuickReply extends TLRPC$Update {
    public TLRPC$TL_quickReply quick_reply;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.quick_reply = TLRPC$TL_quickReply.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-180508905);
        this.quick_reply.serializeToStream(abstractSerializedData);
    }
}
