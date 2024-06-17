package org.telegram.tgnet;

public class TLRPC$TL_messages_getSavedGifs extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_SavedGifs.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1559270965);
        abstractSerializedData.writeInt64(this.hash);
    }
}
