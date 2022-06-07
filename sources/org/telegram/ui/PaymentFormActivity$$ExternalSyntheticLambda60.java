package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PaymentFormActivity$$ExternalSyntheticLambda60 implements RequestDelegate {
    public static final PaymentFormActivity$$ExternalSyntheticLambda60 INSTANCE = new PaymentFormActivity$$ExternalSyntheticLambda60();

    private PaymentFormActivity$$ExternalSyntheticLambda60() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PaymentFormActivity.lambda$sendForm$51(tLObject, tLRPC$TL_error);
    }
}
