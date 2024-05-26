package org.telegram.tgnet;
public class TLRPC$TL_messages_getAvailableEffects extends TLObject {
    public int hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_AvailableEffects.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-559805895);
        abstractSerializedData.writeInt32(this.hash);
    }
}
