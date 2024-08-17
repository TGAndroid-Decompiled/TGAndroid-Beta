package org.telegram.tgnet;

public class TLRPC$TL_account_confirmPasswordEmail extends TLObject {
    public String code;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1881204448);
        abstractSerializedData.writeString(this.code);
    }
}
