package org.telegram.tgnet;

public class TLRPC$TL_inputInvoiceStars extends TLRPC$InputInvoice {
    public static int constructor = 497236696;
    public TLRPC$TL_starsTopupOption option;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.option = TLRPC$TL_starsTopupOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.option.serializeToStream(abstractSerializedData);
    }
}
