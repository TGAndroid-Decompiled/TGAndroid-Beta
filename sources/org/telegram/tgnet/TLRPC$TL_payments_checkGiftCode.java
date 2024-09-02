package org.telegram.tgnet;

public class TLRPC$TL_payments_checkGiftCode extends TLObject {
    public String slug;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_payments_checkedGiftCode.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1907247935);
        abstractSerializedData.writeString(this.slug);
    }
}
