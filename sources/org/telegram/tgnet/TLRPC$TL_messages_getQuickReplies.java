package org.telegram.tgnet;

public class TLRPC$TL_messages_getQuickReplies extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_quickReplies.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-729550168);
        abstractSerializedData.writeInt64(this.hash);
    }
}
