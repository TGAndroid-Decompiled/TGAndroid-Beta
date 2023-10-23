package org.telegram.tgnet;
public class TLRPC$TL_inputInvoiceSlug extends TLRPC$InputInvoice {
    public String slug;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.slug = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1020867857);
        abstractSerializedData.writeString(this.slug);
    }
}
