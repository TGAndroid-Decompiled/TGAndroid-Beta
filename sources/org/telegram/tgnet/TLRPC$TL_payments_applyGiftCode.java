package org.telegram.tgnet;

public class TLRPC$TL_payments_applyGiftCode extends TLObject {
    public String slug;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-152934316);
        abstractSerializedData.writeString(this.slug);
    }
}
