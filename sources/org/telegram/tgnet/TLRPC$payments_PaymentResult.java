package org.telegram.tgnet;

public abstract class TLRPC$payments_PaymentResult extends TLObject {
    public static TLRPC$payments_PaymentResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$payments_PaymentResult tLRPC$payments_PaymentResult;
        if (i != -666824391) {
            tLRPC$payments_PaymentResult = i != 1314881805 ? null : new TLRPC$TL_payments_paymentResult();
        } else {
            tLRPC$payments_PaymentResult = new TLRPC$TL_payments_paymentVerificationNeeded();
        }
        if (tLRPC$payments_PaymentResult != null || !z) {
            if (tLRPC$payments_PaymentResult != null) {
                tLRPC$payments_PaymentResult.readParams(abstractSerializedData, z);
            }
            return tLRPC$payments_PaymentResult;
        }
        throw new RuntimeException(String.format("can't parse magic %x in payments_PaymentResult", Integer.valueOf(i)));
    }
}
