package org.telegram.tgnet;

public abstract class TLRPC$payments_PaymentResult extends TLObject {
    public static TLRPC$payments_PaymentResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$payments_PaymentResult tLRPC$TL_payments_paymentResult = i != -666824391 ? i != 1314881805 ? null : new TLRPC$TL_payments_paymentResult() : new TLRPC$TL_payments_paymentVerificationNeeded();
        if (tLRPC$TL_payments_paymentResult == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in payments_PaymentResult", Integer.valueOf(i)));
        }
        if (tLRPC$TL_payments_paymentResult != null) {
            tLRPC$TL_payments_paymentResult.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_payments_paymentResult;
    }
}
