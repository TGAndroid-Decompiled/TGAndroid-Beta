package org.telegram.tgnet;

public class TLRPC$TL_contacts_toggleTopPeers extends TLObject {
    public boolean enabled;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2062238246);
        abstractSerializedData.writeBool(this.enabled);
    }
}
