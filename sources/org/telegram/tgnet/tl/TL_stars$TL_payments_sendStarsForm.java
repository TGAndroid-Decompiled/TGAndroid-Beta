package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputInvoice;
import org.telegram.tgnet.TLRPC$payments_PaymentResult;

public class TL_stars$TL_payments_sendStarsForm extends TLObject {
    public long form_id;
    public TLRPC$InputInvoice invoice;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$payments_PaymentResult.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2040056084);
        abstractSerializedData.writeInt64(this.form_id);
        this.invoice.serializeToStream(abstractSerializedData);
    }
}
