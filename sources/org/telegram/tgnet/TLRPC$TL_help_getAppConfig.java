package org.telegram.tgnet;
public class TLRPC$TL_help_getAppConfig extends TLObject {
    public int hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$help_AppConfig.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1642330196);
        abstractSerializedData.writeInt32(this.hash);
    }
}
