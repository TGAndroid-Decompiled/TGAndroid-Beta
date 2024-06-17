package org.telegram.tgnet;

public class TLRPC$TL_payments_clearSavedInfo extends TLObject {
    public boolean credentials;
    public int flags;
    public boolean info;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-667062079);
        int i = this.credentials ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.info ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
    }
}
