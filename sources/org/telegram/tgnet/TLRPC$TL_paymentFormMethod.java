package org.telegram.tgnet;

public class TLRPC$TL_paymentFormMethod extends TLObject {
    public String title;
    public String url;

    public static TLRPC$TL_paymentFormMethod TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1996951013 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_PaymentFormMethod", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_paymentFormMethod tLRPC$TL_paymentFormMethod = new TLRPC$TL_paymentFormMethod();
        tLRPC$TL_paymentFormMethod.readParams(abstractSerializedData, z);
        return tLRPC$TL_paymentFormMethod;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.url = abstractSerializedData.readString(z);
        this.title = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1996951013);
        abstractSerializedData.writeString(this.url);
        abstractSerializedData.writeString(this.title);
    }
}
