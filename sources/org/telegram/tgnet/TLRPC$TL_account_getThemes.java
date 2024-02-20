package org.telegram.tgnet;
public class TLRPC$TL_account_getThemes extends TLObject {
    public String format;
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$account_Themes.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1913054296);
        abstractSerializedData.writeString(this.format);
        abstractSerializedData.writeInt64(this.hash);
    }
}
