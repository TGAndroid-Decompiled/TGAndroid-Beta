package org.telegram.tgnet;
public class TLRPC$TL_inputInvoiceSlug extends TLRPC$InputInvoice {
    public static int constructor = -1020867857;
    public String slug;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.slug = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.slug);
    }
}
