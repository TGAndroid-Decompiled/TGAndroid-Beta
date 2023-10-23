package org.telegram.tgnet;
public class TLRPC$TL_help_getPassportConfig extends TLObject {
    public int hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$help_PassportConfig.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-966677240);
        abstractSerializedData.writeInt32(this.hash);
    }
}
