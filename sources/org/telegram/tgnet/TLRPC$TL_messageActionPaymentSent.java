package org.telegram.tgnet;
public class TLRPC$TL_messageActionPaymentSent extends TLRPC$MessageAction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.recurring_init = (readInt32 & 4) != 0;
        this.recurring_used = (readInt32 & 8) != 0;
        this.currency = abstractSerializedData.readString(z);
        this.total_amount = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.invoice_slug = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1776926890);
        int i = this.recurring_init ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        int i2 = this.recurring_used ? i | 8 : i & (-9);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.total_amount);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.invoice_slug);
        }
    }
}
