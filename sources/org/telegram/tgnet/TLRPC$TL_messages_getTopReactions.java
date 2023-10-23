package org.telegram.tgnet;
public class TLRPC$TL_messages_getTopReactions extends TLObject {
    public long hash;
    public int limit;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_Reactions.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1149164102);
        abstractSerializedData.writeInt32(this.limit);
        abstractSerializedData.writeInt64(this.hash);
    }
}
