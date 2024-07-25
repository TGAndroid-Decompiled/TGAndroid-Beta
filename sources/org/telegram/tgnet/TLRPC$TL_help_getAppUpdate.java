package org.telegram.tgnet;
public class TLRPC$TL_help_getAppUpdate extends TLObject {
    public String source;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$help_AppUpdate.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1378703997);
        abstractSerializedData.writeString(this.source);
    }
}
