package org.telegram.tgnet;
public class TLRPC$TL_account_saveSecureValue extends TLObject {
    public long secure_secret_id;
    public TLRPC$TL_inputSecureValue value;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_secureValue.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1986010339);
        this.value.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.secure_secret_id);
    }
}
