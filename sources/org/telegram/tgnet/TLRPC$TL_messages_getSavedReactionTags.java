package org.telegram.tgnet;
public class TLRPC$TL_messages_getSavedReactionTags extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_SavedReactionTags.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1981668047);
        abstractSerializedData.writeInt64(this.hash);
    }
}
